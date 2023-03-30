package cal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalTestIsLeap {
	private Cal cl;

	@Before
	public void setUp()
	{
		cl = new Cal();
	}
	
	
	// Casos de teste para metodo is Leap
	@Test
	public void testIsLeap01() {
		assertTrue(cl.isLeap(2024));
	}
	
	@Test
	public void testIsLeap02() {
		assertFalse(cl.isLeap(2023));
	}
	
	@Test
	public void testIsLeap03() {
		assertFalse(cl.isLeap(1658));
	}
	
	@Test
	public void testIsLeap04() {
		assertTrue(cl.isLeap(1752));
	}
	
	@Test
	public void testIsLeap05() {
		assertTrue(cl.isLeap(2000));
	}
	
	@After
	public void tearDown() {
		cl = null;
	}

}
