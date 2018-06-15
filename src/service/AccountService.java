package service;
import domain.AccountNew;
public interface AccountService {
	public AccountNew createAccountNew(String name, String uid, String pass);
	public void addList(AccountNew account);
	public AccountNew[] list();
	public  int deposit(String money, int restMoney);
	public  int withdrawal(String money);
	public String createAccountNum(String random);
	public String createRandom(int start, int end);
	public String createDate();
	public String showResult();
}
