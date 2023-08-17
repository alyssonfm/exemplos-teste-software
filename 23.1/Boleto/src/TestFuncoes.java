import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class TestFuncoes {

	@Test
	void testPeriodoEmMeses() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date ini, fim;
		try {
			ini = dateFormat.parse("15/09/2021");
			fim = dateFormat.parse("15/10/2021");
			assertEquals(Funcoes.periodoEmMeses(ini, fim), 1);
			fim = dateFormat.parse("30/10/2021");
			assertEquals(Funcoes.periodoEmMeses(ini, fim), 1.5);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testCalculaValorAPagar() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("calculaValorAPagar");
		Boleto boleto = new Boleto();
		Date vcto = dateFormat.parse("03/05/2023");
		Date pgto = dateFormat.parse("02/05/2023");
		assertEquals(500.0, boleto.calculaValorAPagar(500, vcto, pgto), 0.0);
		vcto = dateFormat.parse("03/04/2023");
		pgto = dateFormat.parse("03/05/2023");
		assertEquals(505.0, boleto.calculaValorAPagar(500, vcto, pgto), 0.0);
	}

	@Test
	public void testStringToDate() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("stringToDate");
		Date umaData = dateFormat.parse("03/05/2023");
		assertEquals(umaData, Funcoes.stringToDate("03/05/2023"));
		assertEquals(null, Funcoes.stringToDate("Aloha"));
	}

}
