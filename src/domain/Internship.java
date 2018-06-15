package domain;

public class Internship {
	public static final String DEPT = "인턴십";
	protected String dept, name;
	protected int sal, sum;
	
	public Internship(String name, String sal ) {
		this.name = name;
		this.sal = Integer.parseInt(sal);
		setDept(DEPT);
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSal(String sal) {
		this.sal = Integer.parseInt(sal);
	}
	public String getDept() {
		return dept;
	}
	public int getSal() {
		return sal;
	}
	public String toString() {
		return String.format("이름 : %s, 급여 : %d", name, sal);
	}
}
