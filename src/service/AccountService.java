package service;
import domain.AccountBean;
public interface AccountService {
	public void createAccount(AccountBean account);
	public void addList(AccountBean account);
	public AccountBean[] list();
	public  int deposit(String money, int restMoney);
	public  int withdrawal(String money);
	public String createAccountNum(String random);
	public String createRandom(int start, int end);
	public String createDate();
	public String showResult();
	public AccountBean findById(AccountBean account);
	
}
