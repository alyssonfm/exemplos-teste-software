package account;

public class CheckingAccount extends Account {
	
	public double withdraw(double amount) {
		this.balance -= amount;
		return balance;
	}

}
