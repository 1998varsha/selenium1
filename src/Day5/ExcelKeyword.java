package Day5;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Basic;
import util.ExcelReader;
import util.Keywords;

public class ExcelKeyword extends Basic{
  @Test(dataProvider="dp")
  public void f(String key,String  Locator,String data) throws IOException {
	  Keywords Key=new Keywords(driver);
	  switch(key)
	  {
	  case "getURL'":
		  Key.getUrl(data);
		  break;
	  case "type'" : 
		 Key.type(Locator, data);
		  break;
	  case "click":
			 Key.click(Locator);
			  break;
	  case "takeScreenShot":
			 Key.takeScreenShot(data);
			  break;
	  case "dropDown":
			 Key.dropDown(Locator, data);
			  break;  
	  case "closeBrowser":
			 Key.closeBrowser();
			  break;  
	  }
  }
  @DataProvider
  public Object[][] dp()
  {
	  ExcelReader ex=new ExcelReader("C:\\Users\\vshadmin\\Desktop\\TestCase.xls");
	  Object[][] allKey=ex.getAllData("sheet1", 23, 3);
	  return allKey;
	  
  }
}
