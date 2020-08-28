
public class CafeTest {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("블루베리", 2000));
		cafe.setCoffeeList(new Coffee("딸기", 3000));
		cafe.setCoffeeList(new Coffee("아메리카노", 3000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeeList(new Coffee("아메리카노", 1000));
		System.out.println(cafe.totalPrice());
		
	}
	

}
