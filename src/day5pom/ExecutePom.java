package day5pom;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Basic;
import util.ExcelReader;

public class ExecutePom extends Basic {
  @Test(enabled=false)
  public void f() {
  driver.get("http://127.0.0.1:8080/htmldb/");
	  LoginPom login=new LoginPom(driver);
	  login.loginProcess("sys","Newuser123");
	  Assert.assertEquals(driver.getTitle(), "Oracle","Login Failed");
	  WelcomePom welcome=new WelcomePom(driver);
	  welcome.logoutClick();
  }
  @Test(dataProvider="dp",enabled=true,description="it is using factory method")
	  public void f2(String un,String pwd) {
		  driver.get("http://127.0.0.1:8080/htmldb/");
			  LoginFactory LF=new LoginFactory(driver);
			  LF.loginProcess(un,pwd);
			  Assert.assertEquals(driver.getTitle(), "Oracle","Login Failed");
			  WelcomeFactory WF=new WelcomeFactory(driver);
			  WF.logoutClick();
			  
  }
  @DataProvider
  public Object[][] dp(){
	  ExcelReader ex=new ExcelReader(".//Book2.xlsx");
	  Object data[][]=ex.getAllData("sheet1", 4, 2);
	  return data;
  }
}
