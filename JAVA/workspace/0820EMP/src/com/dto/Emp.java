package com.dto;

public class Emp {
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
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
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the mgr
	 */
	public int getMgr() {
		return mgr;
	}
	/**
	 * @param mgr the mgr to set
	 */
	public void setMgr(int mgr) {
		this.mgr = mgr;
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
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}
	/**
	 * @return the comm
	 */
	public double getComm() {
		return comm;
	}
	/**
	 * @param comm the comm to set
	 */
	public void setComm(double comm) {
		this.comm = comm;
	}
	/**
	 * @return the deptno
	 */
	public int getDeptno() {
		return deptno;
	}
	/**
	 * @param deptno the deptno to set
	 */
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	
}
