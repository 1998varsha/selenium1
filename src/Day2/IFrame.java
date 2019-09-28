package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame {
 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://192.168.100.26:9090/iframe.html");
		   Actions action=new Actions(driver);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.switchTo().frame(0);//switch to iframe
		   driver.findElement(By.linkText("Download")).click();
		   driver.switchTo().defaultContent();
		   driver.switchTo().frame(1);
		   driver.findElement(By.id("P11_USERNAME")).sendKeys("SYS");
		   driver.switchTo().defaultContent();
		   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[3]")));
		   driver.findElement(By.linkText("Register")).click();	   
	}

}
