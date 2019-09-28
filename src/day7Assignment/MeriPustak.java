package day7Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Basic;;

public class MeriPustak extends Basic{
	@Test
	public void f() {
		driver.get("https://www.meripustak.com/cart");
		driver.findElement(By.xpath("//*[text()='Shopping Cart']")).click();
		String txt = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gvCartTable']/tbody/tr/td/h4"))
				.getText();
		Assert.assertEquals(txt, "No Item is Added In Cart yet.Cart is Empty!!!");
		
		driver.findElement(By.name("search")).sendKeys("History");
		driver.findElement(By.cssSelector("a[id='btnsearch']")).click();
		
		driver.findElement(By.xpath("//a[@href='/Aspects-of-Roman-History-82BC-AD14-A-Source-based-Approach-159007']//img[@class='pimg']")).click();
		
		driver.findElement(By.id("ContentPlaceHolder1_AddtoCart")).click();
		
		try {
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gvCartTable']/tbody/tr/td/h4"));
		} catch (NoSuchElementException E) {
			Assert.fail("No Item is Added In Cart yet.Cart is Empty!!!! >> is not Displayed");
		}
	}
}