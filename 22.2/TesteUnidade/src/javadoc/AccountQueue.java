package javadoc;

import account.Account;
import exceptions.AccountQueueException;

/**
 * Interface for the implementation of a queue of accounts.
 * 
 * @version 1.0
 */
public interface AccountQueue {
	
	/**
	 * The max size for the queue.
	 */
	public final int SIZE = 100;
	
	/**
	 * Inserts the specified account into the queue if it is possible to do so 
	 * immediately without violating capacity restrictions, returning true upon 
	 * success and throwing an AccountQueueException if no space is currently available.
	 * @param acc - the account to be added. Must not be null.
	 * @return true if the operation occurs with success.
	 * @throws AccountQueueException - if the queue is full or the account is null.
	 */
	public boolean add(Account acc) throws AccountQueueException;
	
	/**
	 * Retrieves and removes the head of this queue. Throws an exception if the queue is empty 
	 * or if the head of the queue is a SavingsAccount. 
	 * @return the account in the head of the queue. Must not be null and must be of CheckingAccount type.
	 * @throws AccountQueueException - if the queue is empty 
	 * or if the head of the queue is a SavingsAccount. 
	 */
	public Account remove() throws AccountQueueException;
	
	/**
	 * Retrieves, but does not remove, the head of this queue.
	 * @return - the account at the head of this queue or null if the queue is empty. 
	 */
	public Account headElement();
	
	/**
	 * Check if the queue is empty.
	 * 
	 * @return true if and only if the queue does not contains accounts; false otherwise.
	 */
	public boolean isEmpty();
	
	/**
	 * Check if the queue is full.
	 * 
	 * @return true if and only if the queue is full; false otherwise.
	 */
	public boolean isFull();
	
	/**
	 * Returns the number of elements in the queue.
	 * @return the number of elements.
	 */
	public int getQueueSize();
}
