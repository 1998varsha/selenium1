package Day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import util.Basic;
public class ExcelAssignment extends Basic {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  XSSFWorkbook wb=new  XSSFWorkbook(new FileInputStream(".\\Book2.xlsx"));
		 XSSFSheet sheet= wb.getSheet("Sheet1");
		 sheet.getRow(0).createCell(2).setCellValue("status");
		 for(int i=1;i<=sheet.getLastRowNum();i++) 
		 {
		 String user=sheet.getRow(i).getCell(0).toString();
		 String pass=sheet.getRow(i).getCell(1).toString();
	     driver.get("http://127.0.0.1:8080/htmldb/");
		  driver.findElement(By.name("p_t01")).sendKeys(user);
		  driver.findElement(By.name("p_t02")).sendKeys(pass);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  if(driver.getTitle().equals("Oracle"))
		  {
			  sheet.getRow(i).createCell(2).setCellValue("login pass");
			
			/*  driver.findElement(By.linkText("Administration")).click();
			  driver.findElement(By.linkText("Database Users")).click();
			  driver.findElement(By.linkText("HR")).click();
			  Select select=new Select(driver.findElement(By.id("P2613_ACCOUNT_STATUS")));
			  select.selectByVisibleText("Unlocked");*/
			  /*driver.findElement(By.cssSelector("input[value='Alter User']")).click();*/
			  driver.findElement(By.linkText("Logout")).click();
		  }
		  else
		  {
			  System.out.println("login failed");
			  sheet.getRow(i).createCell(2).setCellValue("login Fail");	 
		 }	  
  }
		 wb.write(new FileOutputStream(".//Book2.xlsx"));
  }
  }

 
