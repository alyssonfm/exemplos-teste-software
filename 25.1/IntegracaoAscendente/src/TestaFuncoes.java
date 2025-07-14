import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class TestaFuncoes {

	@Test
	public void testaPeriodoEmMeses1Mes() {
		Date vcto = new Date("09/15/2021");
		Date pgto = new Date("10/15/2021");
		assertEquals(1.0, Funcoes.periodoEmMeses(vcto, pgto));
	}
	
	@Test
	public void testaPeriodoEmMeses1MesEMeio() {
		Date vcto = new Date("09/15/2021");
		Date pgto = new Date("10/30/2021");
		assertEquals(1.5, Funcoes.periodoEmMeses(vcto, pgto));
	}
	
	@Test
	public void testaCalculaValorAPagar() {
		assertEquals(500, Boleto.calculaValorAPagar(500, new Date("09/15/2025"), new Date("09/10/2025")));
	}
	
	@Test
	public void testaCalculaValorAPagar2() {
		assertEquals(505, Boleto.calculaValorAPagar(500, new Date("09/15/2025"), new Date("10/15/2025")));
	}
	
	@Test
	public void testaStringToDate() {
		assertEquals(null, Funcoes.stringToDate("Aloha"));
	}
	
	@Test
	public void testaStringToDate2() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date umaData = dateFormat.parse("15/09/2025");
	    assertEquals(umaData, Funcoes.stringToDate("15/09/2025"));
	}

}
