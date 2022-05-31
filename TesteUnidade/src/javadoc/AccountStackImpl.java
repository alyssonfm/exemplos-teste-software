package javadoc;

import account.Account;
import account.SavingsAccount;
import exceptions.AccountStackException;

public class AccountStackImpl implements AccountStack {

    private Account[] elementsStack;
    private int numberOfElements;

    public AccountStackImpl() {
	elementsStack = new Account[SIZE];
	numberOfElements = 0;
    }

    public Account push(Account acc) {
	if (!isFull()) {
	    elementsStack[numberOfElements] = acc;
	    numberOfElements++;
	}
	return acc;
    }

    public Account pop() throws AccountStackException {
	if (isEmpty() || top() instanceof SavingsAccount) {
	    throw new AccountStackException();
	}
	Account acc = top();
	elementsStack[numberOfElements - 1] = null;
	numberOfElements--;
	return acc;
    }

    public boolean isEmpty() {
	return numberOfElements == 0;
    }

    public int numberElements() {
	return numberOfElements;
    }

    public Account top() {
	if (numberOfElements == 0)
	    return null;
	return elementsStack[numberOfElements - 1];
    }
    
    public double checkBalanceAtTop() {
	return top().getBalance();
    }

    public boolean isFull() {
	return numberOfElements == SIZE;
    }

}
