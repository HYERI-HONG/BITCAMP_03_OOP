package domain;

public class IPhone extends CellPhone {
	
	protected String data;
	public static final String BRAND = "애플";
	public static final String KIND = "아이폰";
	
	public void setData(String data) {
		this.data=data+"이라고 문자를 보냈다.";
	}
	public String getData() {
		return data;
	}
	public String toString() {
		setPortable(true);
		return String.format("%s에게 %s 번호로 %s %s 제품 %s을 사용해서 %s", 
				getName(), getPhoneNum(),getMove(), BRAND, KIND,data);
	}
}
