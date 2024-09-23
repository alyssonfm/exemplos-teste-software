import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

class FuncoesTest {

	@Test
	void testDataOK() {
		assertTrue(Funcoes.stringToDate("02/09/2024") != null);
	}
	
	@Test
	void testDataNotOK() {
		assertTrue(Funcoes.stringToDate("Aloha") == null);
	}
	
	@Test
	void testPeriodoEmMeses() {
		assertEquals(1.0, Funcoes.periodoEmMeses(new Date("09/02/2024"), new Date("10/02/2024")));
	}
}
