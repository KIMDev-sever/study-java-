package part01.sec01.exam01;

public class RefTypeExample9 {

	public static void main(String[] args) {
		Account obj1 = new Account("111-22-33333333", "홍길동", 10000);
		CheckingAccount obj2 = (CheckingAccount) obj1;
		//래퍼런스 타입에 캐스트 연산자를 사용 ==>runtime error
		try {
			int amount = obj2.pay("1234-1234-1234-1234", 100000);
			System.out.println("인출액:" + amount);
			System.out.println("카드번호" + obj2.cardNo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		}
	}

}
