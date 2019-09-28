package Day2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.gecko.driver" ,"D:\\Share Folder\\1SEL\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.bing.com");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 //TakesScreenShot
		   TakesScreenshot screen=(TakesScreenshot)driver;//typecasting
		  File src=  screen.getScreenshotAs(OutputType.FILE);
		  Date date=new Date();
		  String newDate=date.toString().replaceAll(" ", "_").replaceAll(":","_");
		 FileHandler.copy(src, new File(".//bing"+newDate+".png"));
	}
}
