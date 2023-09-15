package javadoc;

import account.Account;
import account.SavingsAccount;
import exceptions.AccountQueueException;

public class AccountQueueImpl implements AccountQueue{
	
	private Account[] elementsQueue;
	private int numberOfElements;
	private int head = 0;
	
	public AccountQueueImpl() {
		elementsQueue = new Account[SIZE];
		numberOfElements = 0;
	}

	public boolean add(Account acc) throws AccountQueueException {
		if(acc == null || this.isFull()) throw new AccountQueueException();
		else{
			elementsQueue[numberOfElements] = acc;
			numberOfElements++;
			return true;
		}
	}

	public Account remove() throws AccountQueueException {
		if(this.isEmpty() || this.headElement() instanceof SavingsAccount) throw new AccountQueueException();
		Account acc = headElement();
		this.numberOfElements--;
		for(int i = 0; i < numberOfElements; i++){
			elementsQueue[i] = elementsQueue[i+1];
		}
		return acc;
	}

	public Account headElement() {
		return elementsQueue[head];
	}

	public boolean isEmpty() {
		return getQueueSize() == 0;
	}

	public boolean isFull() {
		return getQueueSize() == SIZE;
	}

	public int getQueueSize() {
		return this.numberOfElements;
	}

}
