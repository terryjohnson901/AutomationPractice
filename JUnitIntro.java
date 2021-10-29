package basicweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed before test case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after test case");
	}

	@Test
	public void test1() {
		System.out.println("Excuted Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Excuted Test2");
	}

}
