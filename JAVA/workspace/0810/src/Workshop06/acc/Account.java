package Workshop06.acc;

class AccountException extends Exception {
	public AccountException(String mesg) {
		super(mesg);
	}

public class Account {

	private String account;
	private double balance;
	private double interestRate;
	
	Account(){}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
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
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
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

	public double calculateInterest() {
		
		return balance * interestRate;
		
	}
	public void deposit(double money) throws AccountException {
		if(money <= 0 ) {
			throw new AccountException("입금액이 0보다 적습니다.");
		}
		balance += money;
	}
	public void withdraw(double money)throws AccountException{
		 if( money<= 0 || money<balance  ) {
			 throw new AccountException("출금 금액이 0보다 적거나 현재 잔액보다 많습니다.");	
		 }
		balance -= money;
	}
}
}
