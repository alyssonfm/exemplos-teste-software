package javadoc;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.Account;
import exceptions.AccountStackException;

class TestAccStackImpl {
	
	AccountStack accStack;

	@BeforeEach
	void setUp(){
		accStack = new AccountStackImpl();
	}

	@AfterEach
	void tearDown() {
		accStack = null;
	}

	@Test
	void testIsEmpty() {
		assertTrue(accStack.isEmpty());
	}
	
	@Test
	void testNumberElements() {
		assertEquals(0, accStack.numberElements());
	}
	
	@Test
	void testPush() {
		Account countToPush = new Account();
		assertEquals(countToPush, accStack.push(countToPush));
		assertFalse(accStack.isEmpty());
		assertNotNull(accStack.push(countToPush));
		assertEquals(2, accStack.numberElements());
	}
	
	@Test
	void testIsFull() {
		Account countToPush = new Account();
		for (int i = 0; i < AccountStack.SIZE; i++) {
			assertEquals(i, accStack.numberElements());
			accStack.push(countToPush);
		}
		assertTrue(accStack.isFull());
	}
	
	@Test
	void testPopIsEmpty() {
		try {
			accStack.pop();
		} catch (AccountStackException e) {
			
		}
	}

}
