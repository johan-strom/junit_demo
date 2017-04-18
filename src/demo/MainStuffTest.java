package demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainStuffTest {
	
	
	@Test
	public void testAdd() {
		MainStuff stuff = new MainStuff();
		int result = stuff.add(1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void testAdd2SmallFirst() {
		MainStuff stuff = new MainStuff();
		int result = stuff.add2(1, 2); 
		assertEquals(13, result);
	}

	@Test
	public void testAdd2BigFirst() {
		MainStuff stuff = new MainStuff();
		int result = stuff.add2(15, 2); 
		assertEquals(17, result);
	}
	
	@Test
	public void testDivide(){
		MainStuff stuff = new MainStuff();
		int result = stuff.divide(20, 5);
		assertEquals(4, result);
	}
}
