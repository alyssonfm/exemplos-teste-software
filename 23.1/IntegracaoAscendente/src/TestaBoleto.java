import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestaBoleto {
	
	private Boleto b;
	
	@BeforeEach
	void setUp() {
		b = new Boleto();
	}

	@Test
	void testaCalculaValorAPagar() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date i, f;
		double valor = 500.00;
		try {
			i = dateFormat.parse("15/09/2023");
			f = dateFormat.parse("10/09/2023");
			assertEquals(500.00, b.calculaValorAPagar(valor, i, f));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testaCalculaValorAPagar2() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date i, f;
		double valor = 500.00;
		try {
			i = dateFormat.parse("28/09/2023");
			f = dateFormat.parse("28/10/2023");
			assertEquals(505.00, b.calculaValorAPagar(valor, i, f));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
