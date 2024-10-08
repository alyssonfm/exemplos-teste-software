import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

class TestandoFuncoes {

	@Test
	void testStringToDate() {
		assertInstanceOf(Date.class, Funcoes.stringToDate("24/09/2024"));
	}
	
	@Test
	void testStringToDateNull() {
		assertTrue(Funcoes.stringToDate("Aloha") == null);
	}
	
	@Test
	void testPeriodoEmMeses() {
		assertEquals(-1.0, Funcoes.periodoEmMeses(new Date("10/24/2024"), new Date("09/24/2024")));
	}

}
