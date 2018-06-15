package serviceImpl;
import domain.AccountNew;
import service.AccountService; //비즈니스 로직
public class AccountServiceImpl implements AccountService {
	AccountNew[] list;
	int count;
	
	public AccountServiceImpl() {
		list = new AccountNew[3];
		count =0;
	}
	@Override
	public void addList(AccountNew account) {
		list[count++] = account;
	}
	@Override
	public AccountNew[] list() {
		return list;
	} 
	@Override
	public AccountNew createAccountNew(String name, String uid, String pass) {
		return new AccountNew(name, uid, pass);
	}
	@Override
	public int deposit(String money, int restMoney) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdrawal(String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showResult() {
		String result ="";
		for(int i=0; i<count; i++) {
			result +=list()[i].toString();
		}
		return result;
	}

}
