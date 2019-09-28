package day5pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePom {
	WebDriver driver;
	WelcomePom(WebDriver driver){
		this.driver=driver;
	}
	By e_logout=By.linkText("Logout");
	public void logoutClick()
	{
			driver.findElement(e_logout).click();
	}
}
