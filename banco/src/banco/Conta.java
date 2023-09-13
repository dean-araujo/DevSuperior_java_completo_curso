package banco;

public class Conta {

	private int account;
	private String holder;
	private double initialDeposit;
	private double balance;
	
	public Conta(int account, String holder) {
		super();
		this.account = account;
		this.holder = holder;
		this.balance = 0;
	}

	public Conta(int account, String holder, double initialDeposit) {
		super();
		this.account = account;
		this.holder = holder;
		this.initialDeposit = initialDeposit;
		this.balance = this.initialDeposit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccount() {
		return account;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void deposit(double deposit){
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		double tax = 5.0;
		balance = balance - withdraw - tax;
	}

	@Override
	public String toString() {
		return "Account Data: \n"
				+ "Account " + account + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", balance);
	}
	
	
	

}
