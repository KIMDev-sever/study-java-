package part01.sec01.exam02;

public class Employee {
	private int myMoney = 0;

	public Employee(int money) {
		// TODO Auto-generated constructor stub
		this.myMoney = money;
	}

	public void earnMoney(int money) {
		this.myMoney += money;
	}

	public void showMymoney() {
		System.out.println(myMoney);
	}

	public static void main(String[] args) {
		Employer emr = new Employer(3000);
		Employee eme = new Employee(0);
		emr.payForWork(eme, 1000);
		emr.showMymoney();
		eme.showMymoney();
	}
}
