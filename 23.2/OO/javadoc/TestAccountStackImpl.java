package javadoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.Account;
import account.CheckingAccount;
import account.PaymentAccount;
import account.SavingsAccount;

class TestAccountStackImpl {
    
    private AccountStack acc;

    @BeforeEach
    void setUp() throws Exception {
	acc = new AccountStackImpl(); // Estado inicial
    }

    @AfterEach
    void tearDown() throws Exception {
	acc = null; // Estado final
    }

    @Test
    void testIsEmpty() {
	assertTrue(acc.isEmpty());  
	acc.push(new CheckingAccount()); // Mudança de estado, por meio de processamento
	assertFalse(acc.isEmpty()); 
    }
    
    @Test
    void testIsFull() {
	assertFalse(acc.isFull());
	for (int i = 0; i < AccountStack.SIZE; i++) {
	    acc.push(new CheckingAccount());
	}
	assertTrue(acc.isFull());	
    }
    
    @Test
    void testPushNaive() {
	assertEquals(acc.numberElements(), 0);
	acc.push(new Account());
	assertEquals(acc.numberElements(), 1);
	
    }
    
    @Test
    void testPush() {
	assertTrue(acc.push(new Account()) instanceof Account);
	assertTrue(acc.push(new SavingsAccount()) instanceof Account);
	assertTrue(acc.push(new CheckingAccount()) instanceof Account);
	assertTrue(acc.push(new PaymentAccount()) instanceof Account);
    }
    
    @Test
    void testPushAlll() {
	for (int i = 0; i < AccountStack.SIZE; i++) {
	    acc.push(new CheckingAccount());
	}
	assertEquals(acc.numberElements(), 100);
    }
    
    @Test
    void testPushAll() {
	for (int i = 0; i < AccountStack.SIZE; i++) {
	    acc.push(new CheckingAccount());
	    assertEquals(acc.numberElements(), 1);
	    acc.pop();
	}
	assertEquals(acc.numberElements(), 0);
    }
    
    @Test
    void testPop() {
	acc.push(new CheckingAccount());
	assertTrue(acc.top() instanceof CheckingAccount);
	assertTrue(acc.pop() instanceof CheckingAccount);
	assertTrue(acc.isEmpty());
	assertTrue(acc.top() == null);
    }
    
/*    @Test
    void testPopException() {
	acc.pop();
    }
   
    @Test
    void testPopException2() {
	acc.push(new SavingsAccount());
	assertTrue(acc.pop() == null);
    }*/
    
    @Test
    void testNumberElements() {
	assertEquals(acc.numberElements(), 0);
	acc.push(new CheckingAccount());
	assertEquals(acc.numberElements(), 1);
    }

}
