package boleto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaFuncoes {

    private static void testaPeriodoEmMeses() throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("periodoEmMeses");
	Date ini, fim;
	ini = dateFormat.parse("15/09/2021");
	fim = dateFormat.parse("15/10/2021");
	System.out.println((Funcoes.periodoEmMeses(ini, fim) == 1) ? "ok" : "falhou");
	ini = dateFormat.parse("15/09/2021");
	fim = dateFormat.parse("30/10/2021");
	System.out.println((Funcoes.periodoEmMeses(ini, fim) == 1.5) ? "ok" : "falhou");
    }

    public static void main(String[] args) {
	try {
	    testaPeriodoEmMeses();
	} catch (ParseException ex) {
	}
    }

}
