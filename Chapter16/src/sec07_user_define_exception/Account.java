package sec07_user_define_exception;

public class Account {

	private long balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalnceInsufficientException {
		if (balance < money) {
			throw new BalnceInsufficientException("에러난다 이것들아");
		}
		balance -= money;
	}

}
