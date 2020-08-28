package account;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	Account(){}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		return this.balance * this.interestRate;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("출금 할 수 없습니다");
		}else {
			balance -= money;
		}
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
