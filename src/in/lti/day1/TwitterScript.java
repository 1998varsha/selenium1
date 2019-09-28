package in.lti.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterScript {
	  public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://twitter.com/login/");
		  driver.findElement(By.cssSelector("input[placeholder='Phone, email or username']")).sendKeys("varsha"); //typing in text field
		  driver.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='Password']")).sendKeys("123"); //typing in text field
		  WebElement E=driver.findElement(By.cssSelector("button[type='submit']"));
          E.click();
}
}
