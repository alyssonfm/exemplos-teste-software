import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
