package Day4;

import org.testng.annotations.Test;

import util.ExcelReader;

public class ExcelTest  {
@Test
  public void f() {
	ExcelReader ex=new ExcelReader(".//Book2.xlsx");
	for(int i=0;i<=ex.getRowNum("sheet1");i++) {
		System.out.println(ex.getData("sheet1", i, 1));
	}
}
	@Test
	  public void g() {
		ExcelReader ex=new ExcelReader(".//Book2.xlsx");
		String A[][]=ex.getAllData("sheet1", 4, 2);
		for(int i=0;i<A.length;i++) {  //read row
			for(int j=0;j<A[0].length;j++) { //read col
				System.out.println((A[i][j]+" "));
			}
					System.out.println();
  }
}
}
