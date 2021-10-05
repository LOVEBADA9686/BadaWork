package a.b.c.cgitest;

public class EmpVO {
	
	/**
	 * @uml.property  name="empno"
	 */
	private String empno;
	/**
	 * @uml.property  name="ename"
	 */
	private String ename;
	/**
	 * @uml.property  name="job"
	 */
	private String job;
	/**
	 * @uml.property  name="mgr"
	 */
	private String mgr;
	/**
	 * @uml.property  name="hiredate"
	 */
	private String hiredate;
	/**
	 * @uml.property  name="sal"
	 */
	private String sal;
	/**
	 * @uml.property  name="comm"
	 */
	private String comm;
	/**
	 * @uml.property  name="deptno"
	 */
	private String deptno;
	
	public EmpVO(){
		
	}

	public EmpVO(String empno, String ename, String job, String mgr, String hiredate, String sal, String comm,
			String deptno) {
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
	 * @return
	 * @uml.property  name="empno"
	 */
	public String getEmpno() {
		return empno;
	}

	/**
	 * @param empno
	 * @uml.property  name="empno"
	 */
	public void setEmpno(String empno) {
		this.empno = empno;
	}

	/**
	 * @return
	 * @uml.property  name="ename"
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename
	 * @uml.property  name="ename"
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return
	 * @uml.property  name="job"
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job
	 * @uml.property  name="job"
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return
	 * @uml.property  name="mgr"
	 */
	public String getMgr() {
		return mgr;
	}

	/**
	 * @param mgr
	 * @uml.property  name="mgr"
	 */
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	/**
	 * @return
	 * @uml.property  name="hiredate"
	 */
	public String getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate
	 * @uml.property  name="hiredate"
	 */
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	/**
	 * @return
	 * @uml.property  name="sal"
	 */
	public String getSal() {
		return sal;
	}

	/**
	 * @param sal
	 * @uml.property  name="sal"
	 */
	public void setSal(String sal) {
		this.sal = sal;
	}

	/**
	 * @return
	 * @uml.property  name="comm"
	 */
	public String getComm() {
		return comm;
	}

	/**
	 * @param comm
	 * @uml.property  name="comm"
	 */
	public void setComm(String comm) {
		this.comm = comm;
	}

	/**
	 * @return
	 * @uml.property  name="deptno"
	 */
	public String getDeptno() {
		return deptno;
	}

	/**
	 * @param deptno
	 * @uml.property  name="deptno"
	 */
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

}
