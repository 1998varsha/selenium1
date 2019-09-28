package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Bing {
	  public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.bing.com");
	   Actions action=new Actions(driver);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   WebElement E=driver.findElement(By.name("q"));
	  Action a= action.keyDown(Keys.SHIFT) 
	             .sendKeys(E,"lti")
	             .doubleClick(E)
	             .contextClick(E)
	         //    .perform();
	             .build();
	     a.perform();
}
}
