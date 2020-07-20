package part01.sec01.exam02;

public class CheckingAccount extends Account {
	String cardNo;

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		// TODO Auto-generated constructor stub
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
		super(accountNo, ownerName, balance); //부모생성자 호출
		//부모자식간에 이어질려면 반드시 부모가 만들어져야된다
		this.cardNo = cardNo;

	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.contentEquals(this.cardNo) || (balance < amount)) {
			throw new Exception("지불이 불가능 합니다.");
		}
		return withdraw(amount);
	}
}
