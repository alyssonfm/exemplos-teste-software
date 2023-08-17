package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import conta.ContaBancaria;

public class TestContaBancaria {

    ContaBancaria conta;
    double saldoInicial;
    
    @Before
    public void setUp() {
	System.out.println("Inicialização");
	saldoInicial = 100.00;
	conta = new ContaBancaria(saldoInicial, "12345-0");
    }
    
    @After
    public void tearDown() {
	System.out.println("Finalização");
	conta = null;
	saldoInicial = 0.0;
    }
    
    @Test
    public void realizarDepositoContaValorMenor10() {
	assertEquals(conta.realizarDepositoEmConta(9.99, "12345-0"), ContaBancaria.MSG_VALOR_MENOR_10);
	assertTrue(conta.getSaldo() == saldoInicial);
	assertTrue(conta.getSaldo() >= 0);
    }
    
    @Test
    public void realizarDepositoContaValorMaior10() {
	assertEquals(conta.realizarDepositoEmConta(10.01, "12345-0"), ContaBancaria.MSG_DEPOSITO_SUCESSO);
	assertTrue(conta.getSaldo() == saldoInicial+10.01);
    }
    
    @Test
    public void realizarDepositoContaValorIgual10_MIL() {
	assertEquals(conta.realizarDepositoEmConta(10000, "12345-0"), ContaBancaria.MSG_DEPOSITO_SUCESSO);
	assertTrue(conta.getSaldo() == saldoInicial+10000);
    }
    
    @Test
    public void realizarDepositoValorMuitoAlto() {
	assertEquals(conta.realizarDepositoEmConta(100000000000000000.0, "12345-0"), ContaBancaria.MSG_DEPOSITO_SUCESSO);
	assertTrue(conta.getSaldo() == saldoInicial+100000000000000000.0);
    }
    
    @Test
    public void testaNumConta() {
	assertEquals(conta.getNumeroConta(), "12345-0");
    }
}
