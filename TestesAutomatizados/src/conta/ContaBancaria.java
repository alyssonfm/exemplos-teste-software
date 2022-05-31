package conta;

public class ContaBancaria {
    
    private double saldo;
    private String numeroConta;
    
    public static String MSG_VALOR_MENOR_10 = "O valor de depósito deve ser maior do que R$ 9.99";
    public static String MSG_DEPOSITO_SUCESSO = "Depósito realizado com sucesso";
    
    public ContaBancaria(double saldoInicial, String numConta) {
	this.saldo = saldoInicial;
	this.numeroConta = numConta;
    }
    
    public String realizarDepositoEmConta(double valorDepositado, String numConta) {
	if (valorDepositado < 10) {
	    return MSG_VALOR_MENOR_10;
	}
	this.saldo += valorDepositado;
	return MSG_DEPOSITO_SUCESSO;
    }

    public double getSaldo() {
	return this.saldo;
    }
    
    public String getNumeroConta() {
	return this.numeroConta;
    }

}
