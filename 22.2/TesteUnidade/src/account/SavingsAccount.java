package account;

public class SavingsAccount extends Account {

    public double withdraw(double amount) {
	if (amount <= balance)
	    this.balance -= amount;
	return balance;
    }

}
