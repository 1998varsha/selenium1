package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import util.Basic;

public class Scrolling extends Basic {
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.seleniumhq.org/");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Selenium blog")));
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,-500);");
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
	
	 
  }
}
