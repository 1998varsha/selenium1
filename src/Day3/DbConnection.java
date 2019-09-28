package Day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.Basic;

public class DbConnection extends Basic {
   @Test
  public void f() throws Exception
  {
	DriverManager.registerDriver(new oracle.jdbc.OracleDriver());  
	Connection C=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"," hr","hr");
	ResultSet R= C.createStatement().executeQuery("Select * from Login");
	 while(R.next()) {
		 String user= R.getString(1);
		 String pass= R.getString(2);
		  driver.get("http://127.0.0.1:8080/htmldb/");
		  driver.findElement(By.name("p_t01")).sendKeys(user);
		  driver.findElement(By.name("p_t02")).sendKeys(pass);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  driver.findElement(By.linkText("Login")).click();
		  
	    }
  }
}
