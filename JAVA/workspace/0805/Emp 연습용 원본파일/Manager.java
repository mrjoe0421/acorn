
public class Manager extends Employee {

	String depart; //관리부서

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String ssn, String name, String salary, String depart) {
		super(ssn, name, salary);
		this.depart = depart;
	}
	@Override
	public String getEmployee() {
		
		return super.getEmployee()+"\t"+depart;
		//return ssn+"\t"+name+"\t"+salary+"\t"+depart;
	}
	
}
