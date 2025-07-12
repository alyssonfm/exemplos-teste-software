package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.Account;
import account.CheckingAccount;
import account.SavingsAccount;
import exceptions.AccountStackException;
import javadoc.AccountStack;
import javadoc.AccountStackImpl;

public class TestStackImpl {
	
	AccountStack acc;
	
	@BeforeEach
	public void setUp() {
		this.acc = new AccountStackImpl();
	}
	
	@AfterEach
	public void tearDown() {
		this.acc = null;
	}
	

	@Test
	public void testIsEmpty() {
		assertTrue(this.acc.isEmpty());
	}
	
	@Test
	public void testIsNotEmpty() {
		assertTrue(acc.isEmpty());
		acc.push(new CheckingAccount());
		assertFalse(acc.isEmpty());
	}
	
	@Test
	public void testNumberElements() {
		assertEquals(0, acc.numberElements());
		acc.push(new CheckingAccount());
		assertEquals(1, acc.numberElements());
		acc.pop();
		assertEquals(0, acc.numberElements());
	}

	@Test
	public void testTop() {
		acc.push(null);
		assertTrue(acc.top() == null);
		acc.push(new CheckingAccount());
		assertInstanceOf(Account.class, acc.top());
	}
	
	@Test
	public void testPop() {
		acc.push(new CheckingAccount());
		assertInstanceOf(Account.class, acc.pop());
	}
	
	@Test
	public void testPopEmptyStack() {
		try {
			acc.pop();
			
		} catch (AccountStackException e) {
		}
	}
	
	@Test
	public void testPopSavingsAccount() {
		try {
			acc.push(new SavingsAccount());
			acc.pop();
			
		} catch (AccountStackException e) {
		}
	}
	
	@Test
	public void testSize() {
		for (int i = 0; i < AccountStack.SIZE; i++) {
			acc.push(new CheckingAccount());
		}
		assertEquals(AccountStack.SIZE, acc.numberElements());
	}
	
	@Test
	public void testWithDraw() {
		acc.push(new Account());
		assertEquals(1000, acc.top().deposit(1000));
		assertEquals(900, acc.top().withdraw(100));
		assertEquals(900, acc.top().getBalance());
	}
	
}
