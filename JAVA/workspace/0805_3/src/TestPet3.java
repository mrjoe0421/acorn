
public class TestPet3 {

	public static void main(String[] args) {
		Object [] c = {
				10,
				"홍길동",
				new Cat("야옹이", 3, "암놈"),
				new Cat("야옹이", 3, "암놈"),
				new Dog("누렁이", 8, "암놈","검정"),
		};
		for(Object object : c) {
			System.out.println(object);
		

	}

}
}