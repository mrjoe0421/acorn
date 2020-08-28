package workshop07_7;

public class Mobile {

	private String code;
	private String name;
	private double price;
	
	Mobile(){}

	public Mobile(String code, String name, double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.print("코드 : "+code);
		System.out.print("이름 : "+name);
		System.out.print("가격 : "+price);
	}

	
	public String getCode() {
		return code;
	}

	
	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
