package cal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalTestFirstOfMOnth {

	private Cal cl;

	@Before
	public void setUp()
	{
		cl = new Cal();
	}
	
	// Teste do m�todo firstOfMonth
	// os casos de teste devem retornar cada um dos resultados 0,1,2...6
	// para os meses de janeiro e de dezembro. os anos v�o variando para
	// se obter esses resultados
	@Test
	public void testFirstOfMonth01() {
		assertEquals(6,cl.firstOfMonth(1, 1));
	}

}
