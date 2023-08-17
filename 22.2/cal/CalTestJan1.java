package cal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalTestJan1 {
	private Cal cl;

	@Before
	public void setUp()
	{
		cl = new Cal();
	}

	// teste do metodo jan1
	// 
	@Test
	public void testJan101() {
		assertEquals(6,cl.jan1(1));
	}

}
