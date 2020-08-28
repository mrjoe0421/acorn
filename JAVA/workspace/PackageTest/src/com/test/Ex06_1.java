package com.test;

class  Employee{
	String name;
	int salary;
	public String getEmployee() {
		return name + " " + salary;
	}
	public Employee() {
		super();
		System.out.println("Employee 부모 기본생성자 호출=======");
	}
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		
	}
}
	class Manager extends Employee{
		String depart;
		public String getManager() {
			return name + "\t " + salary + "\t " +depart;
		}
		public Manager(String name, int salary, String depart) {
			
			this.name = name;
			this.salary = salary;
			this.depart = depart;
			System.out.println("Manager 자식생성자 호출======");
		
		}
		public String getManager() {
			return name + "\t" + salary + "\t" +depart;
		}
	}

public class Ex06_1 {

	public static void main(String[] args) {
	//	Employee emp = new Employee("홍길동", 2000);
	//	System.out.println("홍길동", 1000);
		Manager man = new Manager("이순신", 4000, "개발");
		System.out.println(man.getManager());

	}

}
