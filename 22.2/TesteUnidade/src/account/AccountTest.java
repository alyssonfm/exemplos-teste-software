package account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	
	Account acc;
	
	@BeforeEach
	void setUp() {
		acc = new Account();
	}
	
	@AfterEach
	void tearDown() {
		acc = null;
	}
	
	@Test
	void testBalance() {
		assertEquals(0.0, acc.getBalance());
	}
	
	@Test
	void testDeposit() {
		double valueToDeposit = 50.0;
		assertEquals(valueToDeposit, acc.deposit(valueToDeposit));
	}
	
	@Test
	void testNegativeDeposit() {
		double valueToDeposit = -50.0;
		assertEquals(acc.getBalance(), acc.deposit(valueToDeposit));
	}
	
	@Test
	void testWithdraw() {
		double valueToWithdraw = 10.0;
		double valueToDeposit = 50.0;
		acc.deposit(valueToDeposit);
		double withdrawedValue = acc.withdraw(valueToWithdraw);
		assertEquals(acc.getBalance(), withdrawedValue);
	}
	
	@Test
	void testNegativeWithdraw() {
		double valueToWithdraw = -10.0;
		double valueToDeposit = 50.0;
		acc.deposit(valueToDeposit);
		double withdrawedValue = acc.withdraw(valueToWithdraw);
		assertEquals(acc.getBalance(), withdrawedValue);
	}
	
	@Test
	void testWithdrawMoreThanBalance() {
		double valueToWithdraw = 100.0;
		double valueToDeposit = 50.0;
		acc.deposit(valueToDeposit);
		double withdrawedValue = acc.withdraw(valueToWithdraw);
		assertEquals(acc.getBalance(), withdrawedValue);
	}

}
