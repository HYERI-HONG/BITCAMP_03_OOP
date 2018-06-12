package domain;
import java.util.Calendar;
public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String uid, accountType, createDate, name, pass, accountNo;

	public void setAccountType() {
		accountType = ACCOUNT_TYPE;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserId(String uid) {
		this.uid = uid;
	}

	public void setPassword(String pass) {
		this.pass = pass;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setAccountNo() {
		String temp = "";
		accountNo="";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				temp += String.valueOf((int) (Math.random() * 10));
			}
			accountNo += i < 2 ? temp + "-" : temp;
			temp="";
		}
	}
	public void setDate() {
		Calendar today = Calendar.getInstance();
		createDate = String.valueOf(today.get(Calendar.YEAR)) + "년 " + String.valueOf(today.get(Calendar.MONTH)+1) + "월 "
				+ String.valueOf(today.get(Calendar.DATE)) + "일";
	}
	
	public  String getAccountType() {
		return accountType;
	}
	public String getName() {
		return name;
	}
	public String getUserId() {
		return uid;
	}
	public String getPassword() {
		return pass;
	}
	public int getMoney() {
		return money;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getDate() {
		return createDate;
	}
	public String toString() {
		setAccountType();
		setAccountNo();
		setDate();
		return String.format("%s\n통장 타입 : %s\n계좌 번호 : %s\n이름 : %s\n생성일 : %s\n잔액 : %d원", BANK_NAME, accountType,
				accountNo, name, createDate, money);
	}

}
