package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	//public int debt; // 대출금
	
	public void setMoney(int money) {
		super.money = (-money);
	}
	public void setAccountType() {
		accountType = ACCOUNT_TYPE;
	}
	public String toString() {
		setAccountType();
		setAccountNo();
		setDate();
		return String.format("%s\n통장 타입 : %s\n계좌 번호 : %s\n이름 : %s\n생성일 : %s\n대출금 : %d원", BANK_NAME, accountType,
				accountNo, name, createDate, money);
	}
}
