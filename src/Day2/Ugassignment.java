package Day2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ugassignment {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	   Actions action=new Actions(driver);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("https://ugc.ac.in/");
	   String PID =driver.getWindowHandle();//current id
	   action.moveToElement(driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/ul/li[5]/a"))).perform();
	   action.keyDown(Keys.CONTROL).click( driver.findElement(By.linkText("Central Universities"))).perform();
	   Set<String> All_ID=driver.getWindowHandles();//collects all tabs/windows ID
	   //switch to child tab ,print title  & close it
	  for(String C:All_ID)
	   
       // Displaying the values after iterating through the iterator 
     

    	   {
 
	   {
		   if(!(C.equals(PID))) {
			   driver.switchTo().window(C);
			   driver.close();
		   
	   }
	   }
	   driver.switchTo().window(PID);
	   driver.quit();
       }
	}
	}
