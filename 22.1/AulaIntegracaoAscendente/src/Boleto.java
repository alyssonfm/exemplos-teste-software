import java.util.Date;

public class Boleto {

    public double calculaValorAPagar(double valor, Date vcto, Date pgto) {
	double valorFinal;
	if (vcto.before(pgto)) {
	    double periodoAtraso = Funcoes.periodoEmMeses(vcto, pgto);
	    valorFinal = valor + (valor * 1 / 100 * periodoAtraso);
	} else {
	    valorFinal = valor;
	}
	return valorFinal;
    }

}
