
public class Fish extends Pet {
	
	private String gender;
	private double tailSize;
	
	
	public Fish(String name, int age,String gender, double tailSize) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tailSize = tailSize;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getTailSize() {
		return tailSize;
	}
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}
	
	public String printInfo() {
		System.out.println("Fish printInfo()호출==========");
		return name +"\t" + age + "\t" + gender + "\t" + tailSize;
	}
}
