package Day4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AllAnotations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("in before ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("in after");
	}
	@Test
	public void test1() {
		System.out.println("in test1");
	}
	@Test
	public void test2() {
		System.out.println("in test 2");
	}
}
