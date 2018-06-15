package domain;

public class StaffSalary extends Internship{
	public static final String DEPT = "정직원";
	protected int bonus; //10%
	
	public StaffSalary(String name, String sal) {
		super(name, sal);
		setDept(DEPT);
	}
	public void setBonus() {
		bonus = (int)(sal*0.1);
		setSal(String.valueOf(sal+bonus));
	}
	public int getBonus() {
		return bonus;
	}
}
