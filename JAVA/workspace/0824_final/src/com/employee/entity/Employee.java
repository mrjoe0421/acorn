package com.employee.entity;

import java.util.Date;

public class Employee {
	
	private int empno;// 사번
	private String ename;// 이름
	private String hiredate;// 입사일
	private String loc;// 근무지
	private int sal;// 연봉
	private String state; // 외출,출장,휴가,근무
	
	public Employee() {}

	public Employee(int empno, String ename, String hiredate, String loc, int sal, String state) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.loc = loc;
		this.sal = sal;
		this.state = state;
	}

	/**
	 * @return the empno
	 */
	public int getEmpno() {
		return empno;
	}

	/**
	 * @param empno the empno to set
	 */
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return the hiredate
	 */
	public String getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate the hiredate to set
	 */
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}

	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", loc=" + loc + ", sal="
				+ sal + ", state=" + state + "]";
	}
	
	


}
