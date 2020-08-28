
public class Cat extends Pet {
	
	 String gender;
	 public String getPet() {
		 return super.getPet() +"\t" + gender;
	 }
	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
//		this.age = age;
//		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String printInfo() {
		// TODO Auto-generated method stub
		return super.printInfo()+"\t"+ gender;
	}

//	public String printInfo() { //리턴타입이 부모와 다르면 에러 발생
//		System.out.println("Cat printInfo()호출==========");
//		return name +"\t" + age + "\t" + gender;
//		
//	}
	
}
