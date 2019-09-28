package day7Assignment;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CiiJunit {
	 Select select;
	@Test
	public void test() {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.cii.in/OnlineRegistration.aspx");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  select=new Select(driver.findElement(By.name("drpAttendee")));
		  select.selectByValue("6");
		  List<WebElement> rows = driver.findElements(By.xpath("\"//*[@id='Gridview1']/tbody/tr\""));
		  int count = rows.size()-1;
		 Assert.assertEquals("6",count);
		  select=new Select(driver.findElement(By.name("Gridview1$ctl02$drpTitle")));
		  select.selectByValue("Col");
		  select=new Select(driver.findElement(By.name("Gridview1$ctl03$drpTitle")));
		  select.selectByVisibleText("CS");
		  select=new Select(driver.findElement(By.name("Gridview1$ctl04$drpTitle")));
		  select.selectByIndex(19);
		  List<WebElement> ls=select.getOptions();
			 for(WebElement EL:ls)
			  {
				  System.out.println(EL.getText());
			  }
			 driver.quit();
}
		
	}


