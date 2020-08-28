

public class Person1 {
	private String name;
	private int age;
	private String address;
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	public Person1(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person1() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
