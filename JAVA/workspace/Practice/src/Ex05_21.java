class Bank{
	
	String name;
	private static Bank b = new Bank("xx은행");
	private Bank(String name) {this.name = name;}
	
	public static Bank getBank() {return b;}
	public String getName() {return name;}
}
public class Ex05_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = Bank.getBank();
		System.out.println("Bank 이름은 : " + b.getName());
	}

}
