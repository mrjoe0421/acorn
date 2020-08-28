package book;

public class BookTest {
	public Book[] arrPrint(Book [] books) {
		for (Book book: books) {
			System.out.println(book.getBookName()
			+"\t"+ book.getBookPrice()
			+"원\t"+book.getBookDiscountRate()
			+"%\t" +book.getDiscountBookPrice()
			+"원");
		}
		//배열의 내용 수정
		

	public static void main(String[] args) {
		Book book1 = new Book ("SQL Plus", 50000, 5.0);
		Book book2 = new Book ("Java 2.0", 40000, 3.0);
		Book book3 = new Book ("JSP Servlet", 60000, 6.0);
		Book []books = new Book[3];
		books [0] = book1;
		books [1] = book2;
		books [2] = book3;
		BookTest test = new BookTest();
		Book[] returnbook=test.arrPrint(books);
		System.out.println(returnbook[0].getBookName());
		
	
//		System.out.println("책이름\t가격\t할인율\t할인후금액");
//		System.out.println("================================");
//		for(int i =0; i<book.length;i++) {
//			System.out.println(book[i].getBookName() + "\t" + book[i].getBookPrice()+ "\t" +book[i].getBookDiscountRate() + "\t" +book[i].getDiscount());
			
		
	
	}

}
