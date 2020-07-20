package part01.sec01.exam02;

import java.io.ObjectInputStream.GetField;

public class InheritanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount obj = new CheckingAccount("111-22-3333333", "홍길동", 1000000, "5555-6666-7777-8888");

		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액:" + paidAmount);
			System.out.println("잔액:" + obj.balance);
		} catch (Exception e) {
			// TODO: handle exception
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}

}
