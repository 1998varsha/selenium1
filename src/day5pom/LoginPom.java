package day5pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPom {
	WebDriver driver;
	LoginPom(WebDriver driver){
		this.driver=driver;
	}

By e_un =By.id("P11_USERNAME"); //uses return type by
By e_pwd =By.id("P11_PASSWORD");

By e_login =By.cssSelector("input[value='Login']");
By e_GetStarted =By.cssSelector("input[value='Getting Started']");

public void loginProcess(String un,String pwd)
{
	driver.findElement(e_un).sendKeys(un);
	driver.findElement(e_pwd).sendKeys(pwd);
	driver.findElement(e_login).click();
}
public void getStartClick()
{
	driver.findElement(e_login).click();
}
}
