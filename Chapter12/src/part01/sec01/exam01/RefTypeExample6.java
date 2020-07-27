package part01.sec01.exam01;

class Account {
	String accountNo;
	String ownerName;
	int balance;

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;

	}
}

class CheckingAccount extends Account {
	String cardNo;

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
		// TODO Auto-generated constructor stub
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!(this.cardNo.equals(cardNo)) || (balance < amount)) {
			throw new Exception("지불이 불가능 합니다.");
		}
		return withdraw(amount);
	}

}

public class RefTypeExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new CheckingAccount("111-22-33333333", "홍길동", 10000, "1234-1234-1234-1234");
		try {
			//int amont=obj.pay("1234-1234-1234-1234",100000);
			//System.out.println("인출액:"+amount);
			//System.out.println("카드번호" +obj.cardNo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
