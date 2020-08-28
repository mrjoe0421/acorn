package account;

public class TestAccount {

	public static void main(String[] args) {
		
		Account user= new Account("441-0290-1203", 500000, 0.073);
		System.out.println("계좌정보 : " + user.getAccount()+ "현재잔액 : "
				+ user.getBalance());
		user.withdraw(600000);
		user.deposit(20000);
		System.out.println("계좌정보 : " + user.getAccount() + "현재잔액 : "
				+ user.getBalance());
		System.out.println("이자 : " + user.calculateInterest());

	}

}
