package oops;

public abstract class Bank {
	
	public abstract void checkBalance();
	
	public abstract void depositMoney();

	public abstract void withdrawMoney();
	
	public void welcome() {
		
		System.out.println("Welcome to Bank");
	}

}
