package account;

public class Account {

		private String account;
		private int balance;
		private double interestRate;
		
		public Account (){}
		
		public Account(String account, int balance, double interestRate) {
			super();
			this.account = account;
			this.balance = balance;
			this.interestRate = interestRate;
		}
		
		public double calculateInterest () {
			return balance * interestRate;
			
		}
		
		public  void deposit(int money) {
			balance += money;
		}
		
		public  void withdraw(int money) {
			if(balance < money) {
				System.out.println("출금 할 수 없습니다");
			}else if(balance > money) {
				balance -= money;
			}
		}

		
		public String getAccount() {
			return account;
		}

		
		public void setAccount(String account) {
			this.account = account;
		}

		public int getBalance() {
			return balance;
		}

		
		public void setBalance(int balance) {
			this.balance = balance;
		}

		
		public double getInterestRate() {
			return interestRate;
		}

		
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
}
