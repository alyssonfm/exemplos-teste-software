import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoletoTest {
	Boleto b;
	
	@BeforeEach
	public void setUp() {
		b = new Boleto();
	}
	
	@AfterEach
	public void tearDown() {
		b = null;
	}

	@Test
	void testCalculaValorAPagar() {
		double valor = 500.0;
		Date inicial = new Date(2026, 05, 10);
		Date finalizacao = new Date(2026, 06, 10);
		assertEquals(505.0, b.calculaValorAPagar(valor, inicial, finalizacao));
	}

}
