package Day8;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;
import day5pom.LoginFactory;
import day5pom.WelcomeFactory;
import util.Basic;

public class CSVExample extends Basic {
  @Test(dataProvider="dp")
  public void f(String un,String pwd) throws IOException {
	  driver.get("http://127.0.0.1:8080/htmldb");
	  LoginFactory login=new LoginFactory(driver);
	  WelcomeFactory Wf=new WelcomeFactory(driver);
	  login.loginProcess(un,pwd);
	  try
	  {
	  Wf.logoutClick();
	  System.out.println("login successful");
  }
	  catch(NoSuchElementException N)
	  {
		  System.out.println("login failed");
	  }
  }
  
  @DataProvider
  public Object[][] dp()
  {
	  Object[][] arraydata=null;
	  try {
	  CSVReader cs=new CSVReader(new FileReader(".//data.csv"));
	  List<String[]> allData=cs.readAll();
	  arraydata  =new Object[allData.size()-1][allData.get(0).length];
	       for(int i=0;i<allData.size()-1;i++)
			  {
				  arraydata[i][0]=allData.get(i+1)[0];
				  arraydata[i][1]=allData.get(i+1)[1];
			  }
  }
	  catch(Exception e) {
	e.printStackTrace();
	  }
	  return arraydata;
}
}


