package service;

public interface AccountService {
	public  int deposit(String money, int restMoney);
	public  int withdrawal(String money);
	public String createAccountNum(String random);
	public String createRandom(int start, int end);
	public String createDate();
	public String showResult();
}
