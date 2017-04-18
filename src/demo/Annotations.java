package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations {

	@BeforeClass
	public static void startClass() {
		System.out.println("In BeforeClass");
	}
	
	@Before
	public void start() {
		System.out.println("In Before");
	}
	
	@After
	public void end() {
		System.out.println("In After");
	}
	
	@AfterClass
	public static void endClass() {
		System.out.println("In AfterClass");
	}
	
	@Test
	public void test1() {
		System.out.println("In test1");;
	}
	@Test
	public void test2() {
		System.out.println("In test2");;
	}

}
