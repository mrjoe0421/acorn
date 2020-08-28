
public class Coffee {
	private String name;
	private int price;
	
	public Coffee() {}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "이름"+["+name+"];
	}
}
