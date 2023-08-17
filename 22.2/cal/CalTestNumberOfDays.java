package cal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalTestNumberOfDays {
	private Cal cl;

	@Before
	public void setUp()
	{
		cl = new Cal();
	}
	

	// teste do m�todo numberOfDays
	// usa cada um dos meses do ano, alem de um mes bissexto e 
	// o mes de mudanca do calend�rio
	@Test
	public void testNumberOfDays01() {
		assertEquals(31, cl.numberOfDays(1, 1963));
	}

}
