package account;

public class Account {
	
	protected double balance;
	
	public Account() {
		this.balance = 0.0;
	}
	
	public double withdraw(double amount){
		this.balance -= amount;
		return balance;
	}
	
	public double deposit(double amount){
		this.balance += amount;
		return balance;
	}

}
