
public class Engineer extends Employee {

	String skill;

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineer(String ssn, String name, String salary, String skill) {
		super(ssn, name, salary);
		this.skill = skill;
	}

	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+"\t"+skill;
	}
	
	
}
