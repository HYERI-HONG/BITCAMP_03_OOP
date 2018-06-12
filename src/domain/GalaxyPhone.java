package domain;

public class GalaxyPhone extends IPhone{
	
	private String size;
	public static final String BRAND = "삼성";
	public static final String KIND = "갤럭시노트폰";
	
	//홍길동에게 010번호로 삼성제품 6인치 
	//갤럭시노트폰을 사용해서 이동가능한 상태로
	//안녕이라고 카톡했다.
	public void setSize() {
		size = "6인치";
	}
	public String getSize() {
		return size;
	}
	public void setData(String data) {
		super.data = data+"이라고 카톡을 보냈다.";
	}
	
	public String toString() {
		setPortable(true);
		return String.format("%s에게 %s 번호로 %s  %s %s 제품 %s을 사용해서 %s", 
				getName(), getPhoneNum(),getMove(),size, BRAND, KIND,getData());
	}

}
