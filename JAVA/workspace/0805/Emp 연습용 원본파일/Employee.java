
public class Employee {

	String ssn;
	String name;
	String salary;
	public Employee() {
		super();//부모의 기본생성자 호출
	}
	public Employee(String ssn, String name, String salary) {
		this.ssn = ssn;
		this.name = name;
		this.salary = salary;
	}
	//getter,setter 생략
	public String getEmployee() {
		return ssn+"\t"+name+"\t"+salary;
	}
	
}
