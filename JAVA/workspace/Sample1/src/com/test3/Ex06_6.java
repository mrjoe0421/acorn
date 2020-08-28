package com.test3;

class Employee1{
	String name;
	int salary;
	public String getEmployee() {
		return name + " " + salary;
	}
	public Employee1() {}
	public Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}
class Manager1 extends Employee1{
	String depart;

	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee() + "" + depart;
	}
	public Manager1(String name, int salary,String depart) {
		super(name, salary);
		this.depart = depart;
	}
}

public class Ex06_6 {

	public static void main(String[] args) {
	Employee1 emp = new Employee1("홍길동", 2000);	
	Manager1 man = new Manager1("이순신", 4000, "개발");
	System.out.println(emp.getEmployee());
	System.out.println(man.getEmployee());

	}

}
