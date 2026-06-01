package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.Account;
import account.CheckingAccount;
import account.SavingsAccount;
import javadoc.AccountStack;
import javadoc.AccountStackImpl;

public class AccountStackTest {
	
	AccountStack acc;

	@BeforeEach
	public void setUp(){
		acc = new AccountStackImpl();
	}

	@AfterEach
	public void tearDown(){
		acc = null;
	}

	@Test
	public void testSize() {
		assertEquals(100, AccountStack.SIZE);
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(acc.isEmpty());
	}
	
	@Test
	public void testIsNotEmpty() {
		assertTrue(acc.isEmpty());
		acc.push(new Account());
		assertFalse(acc.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		assertTrue(acc.isEmpty());
		for (int i = 0; i < AccountStack.SIZE; i++) {
			acc.push(new Account());
		}
		assertEquals(AccountStack.SIZE, acc.numberElements());
	}
	
	@Test
	public void testTop() {
		acc.push(new CheckingAccount());
		assertInstanceOf(Account.class, acc.top());
	}
	
	@Test
	public void testPopIsEmpty() {
		acc.pop();
	}
	
	@Test
	public void testPopSavingsAccount() {
		acc.push(new SavingsAccount());
		assertInstanceOf(Account.class, acc.pop());
	}
	
	@Test
	public void testPop() {
		acc.push(new CheckingAccount());
		assertInstanceOf(Account.class, acc.pop());
	}

}
