package Day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  HSSFWorkbook wb=new  HSSFWorkbook(new FileInputStream(".\\Book1.xls"));
	 HSSFSheet sheet= wb.getSheet("Sheet1");
	 for(int i=0;i<=sheet.getLastRowNum();i++) {
	 String data=sheet.getRow(i).getCell(0).toString();
    System.out.println(data);
    }
  }
}
