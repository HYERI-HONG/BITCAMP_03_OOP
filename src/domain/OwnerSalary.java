package domain;

public class OwnerSalary extends StaffSalary {
	public static final String DEPT = "이사회";
	protected int share;
	
	public OwnerSalary(String name, String sal) {
		super(name, sal);
		setDept(DEPT);
	}
	public void setShare() {
		share = sal*10;
		setSal(String.valueOf(share));
	}
}
