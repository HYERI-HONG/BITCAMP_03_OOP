package domain;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AccountNew {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String uid, accountType, createDate, name, pass, accountNo, balance;
	public AccountNew(String name, String uid, String pass) {
		setAccountType();
		setAccountNo();
		setDate();
		this.name = name;
		this.uid=uid;
		this.pass = pass;
	}
	public void setAccountType() {
		
		accountType = ACCOUNT_TYPE;
	}
	public void setPassword(String pass) {
		this.pass = pass;
	}
	public void setMoney(int money) {
		this.money += money;
		balance = String.valueOf(this.money)+"원";
	}
	public void setAccountNo() {
	
		accountNo = "";
		for (int i = 0; i < 3; i++) {
			accountNo += i < 2 ? String.format("%03d", (int) (Math.random() * 1000)) + "-"
					: String.format("%03d", (int) (Math.random() * 1000));
		}
	}
	public void setDate() {
		this.createDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	
	public void setWithdrawal(int withdrawal) {
		int temp=money-withdrawal;
		if(temp<0) {
			balance = "잔액 부족";
		}
		else {
			balance = String.valueOf(temp)+"원";
			money =temp; 
		}
	}
	public String getAccountType() {
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
	public String getBalance() {
		return "잔액 : "+balance;
	}
	public String toString() {
		return String.format("%s\n통장 타입 : %s\n계좌 번호 : %s\n이름 : %s\n생성일 : %s\n잔액 : %d원", BANK_NAME, accountType,
				accountNo, name, createDate, money);
	}
}
