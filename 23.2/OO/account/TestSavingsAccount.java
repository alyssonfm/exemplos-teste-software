package account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSavingsAccount {
    
    private Account acc;
    private double balance;

    @BeforeEach
    void setUp() throws Exception {
	acc = new SavingsAccount();
	balance = 0;
    }

    @AfterEach
    void tearDown() throws Exception {
	acc = null;
    }

    @Test
    void testDeposit() {
	assertTrue(acc.getBalance() == balance);
	balance = acc.deposit(100.55555);
	assertTrue(acc.getBalance() == balance);
    }
    
    @Test
    void testDepositWithNegativeValue() {
	assertTrue(acc.deposit(5) >= 0);
	
    }
    
    @Test
    void testWithdraw() {
	assertEquals(acc.withdraw(100), 0);
    }
    
    @Test
    void testWithdraw2() {
	acc.deposit(100);
	acc.withdraw(50);
	assertTrue(acc.getBalance() > 0);
    }

}
