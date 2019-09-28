package day6;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import day5pom.LoginFactory;
import day5pom.WelcomeFactory;

@Test
public class GridConnect {
	  WebDriver driver;
  public void f() throws MalformedURLException {

	  driver.get("http://127.0.0.1:8080/htmldb/");
	  LoginFactory LF=new LoginFactory(driver);
	  LF.loginProcess("system", "Newuser123");
	  new WelcomeFactory(driver).logoutClick();
  }
  @BeforeTest
  @Parameters({ "nodeURL","browser" })
  public void beforeTest(String nodeURL,String browser ) throws MalformedURLException {
	  //precondition
	  if(browser.equalsIgnoreCase("chrome")) {
	  DesiredCapabilities dc=	DesiredCapabilities.chrome();
	  dc.setPlatform(Platform.WINDOWS);
	 driver=new RemoteWebDriver(new URL(nodeURL ),dc);
	 
  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  DesiredCapabilities dc=	DesiredCapabilities.chrome();
		  dc.setPlatform(Platform.WINDOWS);
		 driver=new RemoteWebDriver(new URL("nodeURL "),dc);
		   }
	  else if(browser.equalsIgnoreCase("chrome-local"))
	  {
		  System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  }
  @AfterTest //post condition
  public void afterTest() {
	  driver.quit();
  }
}
