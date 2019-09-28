package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Basic {
public WebDriver driver;
  @BeforeTest
  public void beforeTest() throws FileNotFoundException, IOException   //precondition
  {
	  Properties prop=new Properties();
	  prop.load(new FileInputStream(".//settings.property"));
	  
	  System.out.println(prop.getProperty("url"));
	  if(prop.getProperty("browser").equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		 driver=new ChromeDriver();
	  }
	  else if(prop.getProperty("browser").equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver" ,"D:\\Share Folder\\1SEL\\geckodriver.exe"); 
			 driver=new FirefoxDriver();
	  }
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
  }
  
  @AfterTest //post condition
  public void afterTest() {
	  // driver.quit();
  }
}
