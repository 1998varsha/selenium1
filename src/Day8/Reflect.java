package Day8;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Reflect {
  @Test
  public void f() throws Exception {
	 Class cl= Class.forName("org.openqa.selenium.chrome.ChromeDriver");
	 Field[] fd=cl.getDeclaredFields();
	 for(Field F:fd)
	 {
		 System.out.println(F.getName());
	 }
	  System.out.println(cl.getSuperclass());
	  Method[] md=cl.getMethods();
	  for(Method M:md)
	  {
		  System.out.println(M.getName());
	  }
  }
}
