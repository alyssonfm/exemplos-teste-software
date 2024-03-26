package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.Account;
import account.SavingsAccount;

class TestAccount {
	
	Account acc;

	@BeforeEach
	void setUp() throws Exception {
		acc = new SavingsAccount();
		assertTrue(acc != null);
	}

	@AfterEach
	void tearDown() throws Exception {
		acc = null;
		assertTrue(acc == null);
	}

	@Test
	void testBalance() {
		assertEquals(0, acc.getBalance());
		acc.deposit(-1);
		assertEquals(0, acc.getBalance());
	}
	
	@Test
	void testBalance2() {
		acc.deposit(100);
		assertEquals(100, acc.getBalance());
		acc.withdraw(1000);
		assertEquals(100, acc.getBalance());
		acc.withdraw(50);
		assertEquals(50, acc.getBalance());
		assertTrue(acc != null);
	}

}
