package day5pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory //official pom
{
	public LoginFactory(WebDriver driver){
		PageFactory.initElements(driver, this);//initialize the elements with this class
	}
@FindBy(css="input[value='Login']") 
WebElement e_loginButton;
WebElement P11_USERNAME;
WebElement P11_PASSWORD;
public void loginProcess(String un,String pwd)
{
	P11_USERNAME.sendKeys(un);
	P11_PASSWORD.sendKeys(pwd);
	e_loginButton.click();
}


































}
