package Day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(priority=1)
  public void sqlTest()
  {
	  driver.get("http://127.0.0.1:8080/htmldb/");
	  driver.findElement(By.name("p_t01")).sendKeys("sys");
	  driver.findElement(By.name("p_t02")).sendKeys("Newuser123");
	  WebElement E=driver.findElement(By.xpath("//input[@value='Login']"));	
	  E.click();
  }
  @Test(priority=2)
  public void UTest() 
  {
  String title=driver.getTitle();
  Assert.assertEquals(title, "Oracle","title does not match");	
  }

  @Test(priority=3)
  public void WTest() 
  {
	  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/a[1]/img[1]")).click();
		WebElement E = driver.findElement(By.id("P1003_AUTOCOMMIT_0"));
		Assert.assertTrue(E.isSelected(), "Element not enabled");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");	
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
