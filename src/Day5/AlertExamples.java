package Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.Basic;

public class AlertExamples extends Basic{
  @Test
  public void f() {
	  driver.get("https://www.magneticautomation.in/2019/01/alert-example.html");
	  driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
	  Alert A=driver.switchTo().alert();
	  System.out.println(A.getText());
	  A.sendKeys("varsha");
	 /* A.accept();*/   //Click on OK
	 A.dismiss();  //Click on Cancel
  }
}
