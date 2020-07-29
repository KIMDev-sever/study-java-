package part01.sec01.exam01;

class Account {
	String accountNo;
	String ownerName;
	int balance;

	public Account(String accountNo, String ownername, int balance) {
		// TODO Auto-generated constructor stub
		this.accountNo = accountNo;
		this.ownerName = ownername;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount) {
		if (balance < amount) {
			return 0;
		}
		balance -= amount;
		return amount;
	}
}

class SharedArea {
	Account account1;
	Account account2;
}

class TransferThread extends Thread {
	SharedArea sharedArea;

	public TransferThread(SharedArea sharedArea) {
		// TODO Auto-generated constructor stub
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 12; i++) {
			synchronized (sharedArea) { //sharedArea 동기화 시킨다.
				this.sharedArea.account1.withdraw(1000000);
				System.out.print("이몽룡 계좌:100만원 인출,");
				this.sharedArea.account2.deposit(1000000);
				System.out.println("성춘향 계좌:100만원 입금,");
			}
	
		}

	}
}

class PrintThread extends Thread {
	SharedArea sharedArea;

	public PrintThread(SharedArea sharedArea) {
		// TODO Auto-generated constructor stub
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			synchronized (sharedArea) {
				int sum = this.sharedArea.account1.balance + this.sharedArea.account2.balance;
				System.out.println("계좌잔액합계:" + sum);
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}
	}

}

public class MultithreadExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		SharedArea area=new SharedArea();
		area.account1= new Account("111-111-1111", "이몽룡", 20000000);
		area.account2= new Account("222-222-2222", "성춘향", 10000000);
		TransferThread transferThread= new TransferThread(area);
		PrintThread printThread=new PrintThread(area);
		transferThread.start();

		printThread.start();
		
	}

}
