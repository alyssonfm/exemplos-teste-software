import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestandoBoleto {
	
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
	void testCalculaValorAPagar() {
		assertEquals(500.0, b.calculaValorAPagar(500.0, new Date("09/24/2024"), new Date("09/24/2024")));
	}
	
	@Test
	void testCalculaValorAPagarComJuros() {
		assertEquals(510.0, b.calculaValorAPagar(500.0, new Date("09/24/2024"), new Date("11/23/2024")));
	}

}
