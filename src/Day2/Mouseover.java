package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouseover {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	   Actions action=new Actions(driver);
	   WebDriverWait wt=new WebDriverWait(driver,20);
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  WebElement E=driver.findElement(By.cssSelector("input[type='submit']"));
          E.click();
          action.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).perform();
          action.moveToElement(driver.findElement(By.id("menu_leave_Configure"))).perform(); 
	    	action.click(driver.findElement(By.id("menu_leave_defineLeavePeriod"))).perform();

	}

}
