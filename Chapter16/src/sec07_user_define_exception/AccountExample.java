package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		try {
			account.withdraw(1000000000);
		} catch (BalnceInsufficientException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

	}

}
