package Day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstNG {
	WebDriver driver;
  
	@Test
  public void googleTest() {
	  driver.get("https://www.google.com/");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Google","title does not match");			  
  }
	@Test
	  public void a() 
	{
		WebElement E =driver.findElement(By.name("q"));
		Assert.assertEquals(E.isDisplayed(),true);
		Assert.assertTrue(E.isEnabled(),"Element not enabled"); //assertFalse will throw error in this case
	/*	Assert.assertTrue(E.isSelected()); applicable for radio/checkbox*/
	}
	
  @BeforeTest
  public void beforeTest() {
	  //precondition
	  System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");	
	  driver=new ChromeDriver();
  }

  @AfterTest //post condition
  public void afterTest() {
	  driver.quit();
  }
}
