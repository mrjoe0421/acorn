interface Flyer {
	public abstract void takeOff();
	public abstract void fly();
	public void land();
}
class Bird implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird 이륙");}

	@Override
	public void fly() {
		System.out.println("Bird 비행");
		
	}

	@Override
	public void land() {
		System.out.println("Bird 착륙");
		
	}
	
}
public class Ex07_2 {

	public static void main(String[] args) {
		

	}

}
