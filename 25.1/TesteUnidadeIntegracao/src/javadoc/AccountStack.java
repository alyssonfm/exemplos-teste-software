package javadoc;

import account.Account;
import exceptions.AccountStackException;

/**
 * Interface for the implementation of a stack of accounts.
 * 
 * @version 1.0
 */
public interface AccountStack {

	/**
	 * The max size for the stack implementing this interface.
	 */
	public final int SIZE = 100;
	
	/**
	 * Pushes an item into the top of this stack if the number of elements in the stack is less than SIZE.
	 * 
	 * @param acc - the account to be added in a stack. Must not be null.
	 * @return the account being added to the stack.
	 */
	public Account push(Account acc);

	/**
	 * If the account at the top is a CheckingAccount, removes the account,
	 * throws an AccountStackException if the stack is empty or if the account
	 * at the top is a SavingsAccount.
	 * 
	 * @return the account (CheckingAccount) at the top of the stack.
	 * @throws AccountStackException if the stack is empty or if the account at the top is a SavingsAccount.
	 */
	public Account pop() throws AccountStackException;

	/**
	 * Check if the stack is empty.
	 * 
	 * @return true if and only if the stack contains no items; false otherwise.
	 */
	public boolean isEmpty();

	/**
	 * Returns the element at the top of the stack without removing it.
	 * 
	 * @return the account at the top of the stack.
	 */
	public Account top();
	
	/**
	 * Returns the number of elements in a given stack.
	 * 
	 * @return the number of elements into the stack.
	 */
	public int numberElements();

}
