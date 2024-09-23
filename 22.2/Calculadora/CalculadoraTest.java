import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora c;
	
	@BeforeEach
	void setUp() {
		c = new Calculadora(10, 1);
	}
	
	@AfterEach
	void tearDown() {
		c = null;
	}
	
	@Test
	void testSoma() {
		assertEquals(11, c.somar());
	}
	
	@Test
	void testDividir() {
		assertEquals(10, c.dividir());
	}

}
