package part01.sec01.exam02;

public class Account {
//	자바에서 최고 조상은 object클래스이다. 
//	안썻다 하더래도 자바에선 object클래스를 상속받게되어있다.
	String accountNo;
	String ownerName; 
	int balance;

	Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
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
