import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class FuncoesTest {

	@Test
	public void testPeriodoEmMeses() {
		Date inicial = new Date(2026, 05, 10);
		Date finalizacao = new Date(2026, 05, 10);
		assertEquals(0.0, Funcoes.periodoEmMeses(inicial, finalizacao));
	}
	
	@Test
	public void testStringToDateV() {
		String dataValida = "10/06/2026";
		assertInstanceOf(Date.class, Funcoes.stringToDate(dataValida));
	}
	
	@Test
	public void testStringToDateInv() {
		String invalida = "Aloha";
		assertNull(Funcoes.stringToDate(invalida));
	}

}
