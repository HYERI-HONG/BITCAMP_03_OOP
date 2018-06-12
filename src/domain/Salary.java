package domain;

public class Salary {
	
	String dept, name;
	int sal, bonus, sum;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void setSum() {
		sum= sal+bonus;
	}
	public String toString() {
		return String.format("|   %s   |   %s   |   %d   |   %d   |   %d   |", name, dept, sal, bonus, sum);
	}

}
