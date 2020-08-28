package book;

public class Book {
	
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	Book(){}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getDiscountBookPrice() {
		 return this.bookPrice * (1-this.bookDiscountRate /100);
		
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the bookPrice
	 */
	public int getBookPrice() {
		return bookPrice;
	}

	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	/**
	 * @return the bookDiscountRate
	 */
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	/**
	 * @param bookDiscountRate the bookDiscountRate to set
	 */
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
}
