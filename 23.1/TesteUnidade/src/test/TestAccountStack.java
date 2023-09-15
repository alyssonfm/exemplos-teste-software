package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.Account;
import account.CheckingAccount;
import account.SavingsAccount;
import exceptions.AccountStackException;
import javadoc.AccountStack;
import javadoc.AccountStackImpl;

class TestAccountStack {
	
	private AccountStack pilhaContas;

	@BeforeEach
	void setUp() {
		pilhaContas = new AccountStackImpl();
	}
	
	@AfterEach
	void tearDown() {
		pilhaContas = null;
	}
	
	@Test
	void testIsEmpty() {
		assertTrue(pilhaContas.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		assertTrue(pilhaContas.isEmpty());
		pilhaContas.push(new Account());
		assertFalse(pilhaContas.isEmpty());
	}
	
	@Test
	void testIsFull() {
		for (int i = 0; i <= AccountStack.SIZE; i++) {
			pilhaContas.push(new Account());
		}
		assertTrue(pilhaContas.isFull());
		assertEquals(AccountStack.SIZE, pilhaContas.numberElements());
	}
	
	@Test
	void testIsNotFull() {
		pilhaContas.push(new Account());
		assertFalse(pilhaContas.isFull());
	}
	
	@Test
	void testNumberElements() {
		assertEquals(0, pilhaContas.numberElements());
		pilhaContas.push(new CheckingAccount());
		assertEquals(1, pilhaContas.numberElements());
	}
	
	@Test
	void testPopOk() {
		pilhaContas.push(new CheckingAccount());
		assertNotNull(pilhaContas.pop());
		pilhaContas.push(new CheckingAccount());
		assertTrue(pilhaContas.pop() instanceof CheckingAccount);
	}
	
	@Test
	void testPopException() {
		assertThrows(AccountStackException.class, () -> pilhaContas.pop());
		pilhaContas.push(new SavingsAccount());
		assertThrows(AccountStackException.class, () -> pilhaContas.pop());
	}

}
