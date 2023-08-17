package boleto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoletoTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testPeriodoEmMeses() throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("periodoEmMeses");
	Date ini, fim;
	ini = dateFormat.parse("15/09/2020");
	fim = dateFormat.parse("15/10/2020");
	assertEquals(1.0, Funcoes.periodoEmMeses(ini, fim), 0.0);
	ini = dateFormat.parse("15/09/2020");
	fim = dateFormat.parse("30/10/2020");
	assertEquals(1.5, Funcoes.periodoEmMeses(ini, fim), 0.0);
    }

    @Test
    public void testCalculaValorAPagar() throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("calculaValorAPagar");
	Boleto boleto = new Boleto();
	Date vcto = dateFormat.parse("15/09/2020");
	Date pgto = dateFormat.parse("10/09/2020");
	assertEquals(500.0, boleto.calculaValorAPagar(500, vcto, pgto), 0.0);
	vcto = dateFormat.parse("15/09/2020");
	pgto = dateFormat.parse("15/10/2020");
	assertEquals(505.0, boleto.calculaValorAPagar(500, vcto, pgto), 0.0);
    }

    @Test
    public void testStringToDate() throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("stringToDate");
	Date umaData = dateFormat.parse("15/09/2020");
	assertEquals(umaData, Funcoes.stringToDate("15/09/2020"));
	assertEquals(null, Funcoes.stringToDate("xpto"));
    }

}
