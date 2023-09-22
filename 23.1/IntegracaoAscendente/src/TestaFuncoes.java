import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class TestaFuncoes {

	@Test
	void testaPeriodoEmMeses() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date i, f;
		try {
			i = dateFormat.parse("21/09/2023");
			f = dateFormat.parse("21/10/2023");
			assertEquals(1.0, Funcoes.periodoEmMeses(i, f));
			f = dateFormat.parse("05/11/2023");
			assertEquals(1.5, Funcoes.periodoEmMeses(i, f));
			f = dateFormat.parse("06/09/2023");
			assertEquals(-0.5, Funcoes.periodoEmMeses(i, f));
			f = dateFormat.parse("06/10/2023");
			assertEquals(0.5, Funcoes.periodoEmMeses(i, f));
			/*
			 * i = dateFormat.parse("09/04/2023"); double d = Funcoes.periodoEmMeses(i, f);
			 * System.out.println(d);
			 */
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testStringToDate() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date umaData = dateFormat.parse("15/09/2023");
		assertEquals(umaData, Funcoes.stringToDate("15/09/2023"));
		assertEquals(null, Funcoes.stringToDate("xpto"));
	}

}