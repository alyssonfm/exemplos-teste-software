package account;

public class Account {
	
	protected double balance;
	
	public Account() {
		this.balance = 0.0;
	}
	
	public double withdraw(double amount){
		if(amount <= balance)
			this.balance -= amount;
		return balance;
	}
	
	public double deposit(double amount){
		if(amount >= 0)
			this.balance += amount;
		return balance;
	}
	
	public double getBalance() {
		return this.balance;
	}

}
