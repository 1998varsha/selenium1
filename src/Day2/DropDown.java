package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver" ,"D:\\Share Folder\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://blazedemo.com/");
		  Select select=new Select(driver.findElement(By.name("fromPort")));
		//  select.selectByIndex(6);
		  select.selectByValue("Paris");
		  Select select1=new Select(driver.findElement(By.name("toPort")));
		  select1.selectByValue("Berlin");
		  // select.selectByVisibleText("Boston");
		/*  System.out.println(select.isMultiple());*/
		  //System.out.println(select.getFirstSelectedOption().getText());
		  /*List<WebElement> ls=select.getOptions();
		 for(WebElement EL:ls)
		  {
			  System.out.println(EL.getText());
		  }*/
		  WebElement E=driver.findElement(By.cssSelector("input[type='submit']"));
          E.click();
          List<WebElement> flights=driver.findElements(By.cssSelector("input[type='submit']"));
          flights.get(2).click();
          driver.findElement(By.name("inputName")).sendKeys("varsha");
          driver.findElement(By.name("address")).sendKeys("Lti");
          driver.findElement(By.name("city")).sendKeys("mumbai");
          driver.findElement(By.name("state")).sendKeys("maharashtra");
      /*    driver.findElement(By.name("state")).sendKeys("maharashtra");*/
          driver.findElement(By.name("zipCode")).sendKeys("12345");
          Select select2=new Select(driver.findElement(By.name("cardType")));
    	  select2.selectByValue("visa");
    	  driver.findElement(By.name("creditCardNumber")).sendKeys("12345");
    	  driver.findElement(By.name("creditCardMonth")).clear();
    	  driver.findElement(By.name("creditCardMonth"))  .sendKeys("11");
    	  driver.findElement(By.name("creditCardYear")).clear();
    	  driver.findElement(By.name("creditCardYear")).sendKeys("2019");
    	  driver.findElement(By.name("nameOnCard")).sendKeys("varsha"); 
    	  WebElement webelement1=driver.findElement(By.name("rememberMe"));
    	  webelement1.click();
    	  WebElement webelement2=driver.findElement(By.cssSelector("input[type='submit']"));
    	  webelement2.click();
	}

}
