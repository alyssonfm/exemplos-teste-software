package cal;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalTestCal {
	private Cal cl;	// Declaração

	@Before
	public void setUp()
	{
		cl = new Cal(); // Definição
	}
	
	// teste do metodo Cal
	// recebe como parametro o primeiro dia da semana
	// do mes e o numero de dias do mes
	@Test
	public void testCal01() {
		assertEquals("       1  2 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30",
				     cl.cal(0, 19));	// Uso
	}
	
	@Test
	public void testCal02() {
		assertEquals("                   1\n"
				+ " 2  3  4  5  6  7  8\n"
				+ " 9 10 11 12 13 14 15\n"
				+ "16 17 18 19 20 21 22\n"
				+ "23 24 25 26 27 28 29\n"
				+ "30 ",
				cl.cal(6, 30));
	}
	
	@After
	public void tearDown() {
		cl = null; // Destruição
	}

}
