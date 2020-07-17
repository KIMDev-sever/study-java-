package part01.sec01.exam02;

public class Employer {
	private int myMoney;

	public Employer(int money) {
		this.myMoney = money;
	}

	public void payForWork(Employee emp, int money) {
		if (myMoney < money) {
			return;
		}
		emp.earnMoney(money);
		myMoney -= money;
	}

	public void showMymoney()
	{
		System.out.println(myMoney);
	}
}
