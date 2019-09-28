package Day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class DargDrop {

	public static void main(String[] args) throws IOException {
/*	  System.setProperty("webdriver.gecko.driver" ,"D:\\Share Folder\\1SEL\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	   Actions action=new Actions(driver);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://jqueryui.com/droppable/");
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
   WebElement source=driver.findElement(By.id("draggable"));
   WebElement target=driver.findElement(By.id("droppable"));
   action.dragAndDrop(source, target).perform();
   TakesScreenshot screen=(TakesScreenshot)driver;//typecasting
 /*  File src=screen.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File(".//jquery.png"));*/
File src1=screen.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src1, new File(".//jquery1.png"));
}

}
