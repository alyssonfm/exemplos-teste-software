package boleto;

import java.util.Date;

import javax.swing.JOptionPane;

public class Boleto {

    public static void main(String[] args) {
	Boleto boleto = new Boleto();
	// entrada de dados
	double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor devido"));
	Date dataVcto = Funcoes.stringToDate(JOptionPane.showInputDialog("Informe a data do vencimento"));
	Date dataPgto = Funcoes.stringToDate(JOptionPane.showInputDialog("Informe a data do pagamento"));
	// processo
	double valorFinal = boleto.calculaValorAPagar(valor, dataVcto, dataPgto);
	// saida de dados
	JOptionPane.showMessageDialog(null, "Valor Final: " + valorFinal);
    }

    public double stubCalculaValorAPagar(double valor, Date vcto, Date pgto) {
	return valor;
    }

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
