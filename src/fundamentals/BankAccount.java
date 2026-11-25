package fundamentals;

public class BankAccount {
	private double balance=1000;
	
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance+amount;
		}
		
	}
	public double getBalance() {
		return balance;
	}
	

}
