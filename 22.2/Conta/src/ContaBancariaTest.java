import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaBancariaTest {
    
    ContaBancaria conta;
    double saldoInicial = 100.00;

    @BeforeEach
    void setUp() throws Exception {
	conta = new ContaBancaria("12345-0", saldoInicial);
    }

    @AfterEach
    void tearDown() throws Exception {
	conta = null;
    }

    @Test
    void testRealizarDepositoContaValorMenor10() {
	assertEquals(ContaBancaria.MSG_VALOR_MENOR_10, conta.realizarDepositoEmConta(9.99));
	assertTrue(conta.getSaldo() == saldoInicial);
    }
    
    @Test
    void testRealizarDepositoContaValorMaior10() {
	assertEquals(ContaBancaria.MSG_DEPOSITO_SUCESSO, conta.realizarDepositoEmConta(10000));
	assertTrue(conta.getSaldo() == 10000 + saldoInicial);
    }

}
