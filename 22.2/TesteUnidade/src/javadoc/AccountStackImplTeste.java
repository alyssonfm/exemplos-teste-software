package javadoc;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.CheckingAccount;
import account.PaymentAccount;

class AccountStackImplTeste {

	AccountStackImpl accStack;

	@BeforeEach
	void setUp() {
		accStack = new AccountStackImpl();
	}

	@AfterEach
	void tearDown() {
		accStack = null;
	}

	@Test
	void testPopSuccess() {
		accStack.push(new CheckingAccount());
		assertTrue(accStack.pop() instanceof CheckingAccount);
	}
	
	@Test
	void testPopSuccess2() {
		accStack.push(new PaymentAccount());
		assertTrue(accStack.pop() instanceof PaymentAccount);
	}

}
