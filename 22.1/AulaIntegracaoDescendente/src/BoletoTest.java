import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoletoTest {

	Boleto b;
	
	@BeforeEach
	void setUp() {
		b = new Boleto();
	}
	
	@AfterEach
	void tearDown() {
		b = null;
	}
	
	@Test
	void testCalculaValorPagar() {
		assertEquals(500.0, b.calculaValorAPagar(500.0, new Date(2024, 9, 2), new Date(2024, 9, 1)));
	}
	
	@Test
	void testCalculaValorPagarVencido() {
		assertEquals(505.0, b.calculaValorAPagar(500.0, new Date(2024, 8, 2), new Date(2024, 9, 2)));
	}

}
