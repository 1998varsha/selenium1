package Day5;

import java.io.IOException;

import org.testng.annotations.Test;

import util.Basic;
import util.Keywords;

public class ExecuteKey extends Basic{
  @Test
  public void f() throws IOException {
	  Keywords key=new Keywords(driver);
	  driver.manage().window().maximize();
	  key.getUrl("http://blazedemo.com/");
	 key.type("name:=q", "keyword driven framework");
	  key.click("id:=sb_form_go");
	  key.takeScreenShot(".//assignment.png");
	  key.dropDown("name:=fromPort", "Boston");
	  key.closeBrowser();
  }
}
