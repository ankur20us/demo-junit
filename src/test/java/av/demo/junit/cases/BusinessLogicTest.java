/**
 * 
 */
package av.demo.junit.cases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import av.demo.junit.BusinessLogic;
import av.demo.junit.BusinessLogicRuntimeException;

/**
 * @author av
 *
 */
public class BusinessLogicTest {

	private BusinessLogic businessLogic;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("I am setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("I am tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		businessLogic = new BusinessLogic();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * Simple straight forward testing
	 */
	@Test
	public void test1() {
		assertEquals(businessLogic.divide(15, 3), 5);
	}
	
	
	/***
	 * Expecting a exception that might come in Runtime since the class extended the Runtime Exception
	 */
	@Test(expected=BusinessLogicRuntimeException.class)
	public void test2() {	
		assertEquals(businessLogic.divide(5, 0), 14);
	}
	
	/***
	 * This will not work since the function being tested is throwing the Compiletime Exception
	 * When you start this code make sure to keep the supporing classes in the header sectiono of this file
	 */
//	@Test(expected=BusinessLogicCompiletimeException.class)
//	public void test3() {	
//		assertEquals(businessLogic.add(5, 0), 14);
//	}
}
