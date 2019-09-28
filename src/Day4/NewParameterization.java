package Day4;

import org.testng.annotations.Test;

import util.Basic;
import util.ExcelReader;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewParameterization extends Basic{
  @Test(dataProvider = "dp")
  public void f(String username, String pwd) {
/*	  System.out.println(username+" "+pwd);*/
	  driver.findElement(By.name("p_t01")).sendKeys(username);
	  driver.findElement(By.name("p_t02")).sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  Assert.assertEquals(driver.getTitle(), "Oracle","Login Failed");
	  driver.findElement(By.linkText("Logout")).click();
	  driver.findElement(By.linkText("Login")).click();
  }
  @AfterMethod
  public void afterMethod(ITestResult arg) throws IOException
  {
	  if(arg.getStatus()==ITestResult.FAILURE) {
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Date date=new Date();
		  String newDate=date.toString().replaceAll(" ", "_").replaceAll(":","_");
		 FileHandler.copy(src, new File(".//"+arg.getName()+newDate+".png"));
	  }
  }

  @DataProvider
  public Object[][] dp() {
   // a place to store data used for data driven testing
	  ExcelReader excel=new ExcelReader(".//Book2.xlsx");
	/*  Object data[][]=new Object[4][2];
			  data[0][0]="system";
			  data[0][1]="Newuser123";
			  data[1][0]="tester2";
			  data[1][1]="tester2";
			  data[2][0]="tester3";
			  data[2][1]="tester3";
			  data[3][0]="hr";
			  data[3][1]="hr";*/
	  Object[][] d=excel.getAllData("sheet1",4,2);
       return d;
  }
}
