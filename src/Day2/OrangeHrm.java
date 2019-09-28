package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   // global wait starts at the top and declared only once
		  WebDriverWait wt=new WebDriverWait(driver,20);
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  WebElement E=driver.findElement(By.cssSelector("input[type='submit']"));
          E.click();
          driver.findElement(By.linkText("Welcome Admin")).click();
          wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));//explicit wait
          driver.findElement(By.linkText("Logout")).click();
        
}
}
