package domain;

public class MinusAccountNew extends AccountNew {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int limit;
	
	public MinusAccountNew(String name, String uid, String pass) {
		super(name,uid,pass);
		setAccountType();
	}
	public void setAccountType() {
		accountType = ACCOUNT_TYPE;
	}
	public void setLimit(int limit) {
		this.limit -= limit;
	}

	public void setWithdrawal(int withdrawal) {
		int temp=money-withdrawal;
		if(temp<limit) {
			balance = "한도 초과";
		}
		else {
			balance = String.valueOf(temp)+"원";
			money =temp; 
		}
	}
	public int getLimit() {
		return limit;
	}
	public String toString() {

		return String.format("%s\n통장 타입 : %s\n계좌 번호 : %s\n이름 : %s\n생성일 : %s\n대출금 : %d원", BANK_NAME, accountType,
				accountNo, name, createDate, money);
	}
}
