package Day4;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CookieTest {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--headless");
		 driver=new ChromeDriver(ch);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
	driver.get("http://127.0.0.1:8080/htmldb/");
	  driver.findElement(By.name("p_t01")).clear();
	  driver.findElement(By.name("p_t01")).sendKeys("sys");
	  driver.findElement(By.name("p_t02")).clear();
	  driver.findElement(By.name("p_t02")).sendKeys("Newuser123");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
	  Set<Cookie> All_COOKIE=driver.manage().getCookies();
	  for(Cookie C:All_COOKIE) {
		  System.out.println("Domain name is"+ C.getDomain());
		  System.out.println("Name is"+ C.getName());
		  System.out.println("Path is"+ C.getPath());
		  System.out.println("value is"+ C.getValue());
		  System.out.println(" Expiry is"+ C.getExpiry());
	  }
	  driver.manage().deleteAllCookies();
	  driver.navigate().refresh();
/*	  driver.navigate().to(new URL(""));*/
	  assertEquals(driver.getTitle(),"HTML DB Login");
	
	}

}
