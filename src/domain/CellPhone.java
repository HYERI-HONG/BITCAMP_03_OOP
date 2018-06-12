package domain;

public class CellPhone extends Phone {
	public static final String BRAND = "노키아";
	public static final String KIND = "휴대폰";
	private boolean portable;
	private String move;

	public void setPortable(boolean portable) {
		setMove((portable) ? "이동 가능" : "이동 불가");
		this.portable = portable;
	}
	public boolean isPortable() {
		return portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}

	public String toString() {
		setPortable(true);
		return String.format("%s에게 %s 번호로 %s %s 제품 %s를 사용해서 %s 라고 통화했다. ", super.getName(), super.getPhoneNum(), move,
				BRAND, KIND, super.getCall());
	}
}
