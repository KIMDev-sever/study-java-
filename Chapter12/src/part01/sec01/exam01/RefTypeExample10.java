package part01.sec01.exam01;

public class RefTypeExample10 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Account obj1 = new Account("111-22-33333333", "홍길동", 10000);
		// instanceof 연산자:캐스트 연산 가능성을 검사하는 연산자
		if (obj1 instanceof CheckingAccount) {
			pay((CheckingAccount)obj1);
		}else {
			System.out.println("캐스트 할 수 없는 타입입니다.");
		}
	}
		//래퍼런스 타입에 캐스트 연산자를 사용 ==>runtime error

	

	public static void pay(CheckingAccount obj1){
		try {
			int amount =obj1.pay(obj1.cardNo, 47000);;
			System.out.println("인출액:" + amount);
			System.out.println("카드번호" + obj1.cardNo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		}
	
	}

}
