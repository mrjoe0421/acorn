package workshop06.acc;

public class Account{
    private String account;
    private double balance;
    private double interestRate;

    public Account(String account,double balance,double interestRate){
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest(){
        double interest = 0.0;
        interest = balance * (interestRate*0.01);
        return interest;
    }

    public void deposit(double money)throws AccountException{
        if(money <= 0){
            throw new AccountException("입금 금액이 0보다 적습니다");
        }

        balance += money;
    }

    public void withdraw(double money)throws AccountException{
        if(money <= 0 || money > balance){
            throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
        }
        balance -= money;
    }
}

