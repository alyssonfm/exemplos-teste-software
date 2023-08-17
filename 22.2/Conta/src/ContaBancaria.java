
public class ContaBancaria {
    
    static String MSG_VALOR_MENOR_10 = "O valor de depósito deve ser maior do que R$ 9.99";
    static String MSG_DEPOSITO_SUCESSO = "Depósito realizado com sucesso";
    private double saldo;
    private String numConta;
    
    public ContaBancaria(String conta, double saldo) {
	this.numConta = conta;
	this.saldo = saldo;
    }
        
    public String realizarDepositoEmConta(double valorDepositado) {
    	if (valorDepositado < 10) {
    	    return MSG_VALOR_MENOR_10;
    	}
    	this.saldo += valorDepositado;
    	return MSG_DEPOSITO_SUCESSO;
    }
    
    /*
   * Method that returns the balance of the current account.
   */
    public double getSaldo() {
	return this.saldo;
    }

}
