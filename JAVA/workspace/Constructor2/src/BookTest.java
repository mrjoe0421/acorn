
public class BookTest {

	public static void main(String[] args) {
		
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.setTitle("홍길동전");
		book1.setPrice(1000);
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		//클래스명 변수명 = new 클래스명();
		/*
		 * Book book1 = new Book(); Book book2 = new Book();
		 * 
		 * 
		 * book1.name = "홍길동전"; book1.price = 1000;
		 * 
		 * book2.name = "토끼전"; book2.price = 2000;
		 * 
		 * System.out.println(book1.name); System.out.println(book1.price);
		 * System.out.println(book2.name); System.out.println(book2.price);
		 */
		
	}

}
