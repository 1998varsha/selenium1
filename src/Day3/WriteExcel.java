package Day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import util.Basic;

public class WriteExcel extends Basic {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  XSSFWorkbook wb=new  XSSFWorkbook(new FileInputStream(".\\Book2.xlsx"));
	  XSSFSheet sheet= wb.getSheet("Sheet1");
	  sheet.getRow(2).getCell(1).setCellValue("lti");
	  sheet.getRow(2).createCell(2).setCellValue("lti");
	  sheet.createRow(5).createCell(2).setCellValue("lti");
		wb.write(new FileOutputStream(".//abc.xlsx"));
  }
}
