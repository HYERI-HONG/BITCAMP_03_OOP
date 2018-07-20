package serviceImpl;
import domain.AccountBean;
import service.AccountService; //비즈니스 로직
public class AccountServiceImpl implements AccountService {
	AccountBean[] list;
	int count;
	
	public AccountServiceImpl() {
		list = new AccountBean[3];
		count =0;
	}
	@Override
	public void addList(AccountBean account) {
		list[count++] = account;
	}
	@Override
	public AccountBean[] list() {
		return list;
	} 
	@Override
	public void createAccount(AccountBean account) {
		account.setAccountNo(createAccountNum(createRandom(0,999)));
		addList(account);
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
		return random;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		String test = "123-456-789";
		return test;
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
	@Override
	public AccountBean findById(AccountBean account) {
		AccountBean acc = new AccountBean();
		//배열 리스트를 looping하면서 ID가 일치하고 비번이 일치한 값을 찾아서 그 객체를 리턴한다.
		//일단 일치하는 값이 없는 상황은 나중에 처리
		return acc;
	}

}
