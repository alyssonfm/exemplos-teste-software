package javadoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.Account;
import account.SavingsAccount;

class PilhaTesteJUnit {
    
    AccountStack acc;

    @BeforeEach
    void setUp() throws Exception {
	acc = new AccountStackImpl();
    }

    @AfterEach
    void tearDown() throws Exception {
	acc = null;
    }

    @Test
    void testSize() {
	assertEquals(100, AccountStack.SIZE);
    }
    
    @Test
    void testNumberElements() {
	assertEquals(0, acc.numberElements());
    }
    
    @Test
    void testPush() {
	assertTrue(acc.push(new Account()) instanceof Account);
	assertEquals(1, acc.numberElements());
    }
    
    @Test
    void testPop() {
	acc.push(new Account());
	assertEquals(1, acc.numberElements());
	acc.pop();
	assertTrue(acc.isEmpty());
	acc.pop();
    }
    
    @Test
    void testPop2() {
	acc.push(new SavingsAccount());
	assertEquals(1, acc.numberElements());
	acc.pop();
    }
    

}
