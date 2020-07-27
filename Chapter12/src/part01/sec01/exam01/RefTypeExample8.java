package part01.sec01.exam01;

public class RefTypeExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new CheckingAccount("111-22-33333333", "홍길동", 10000, "1234-1234-1234-1234");
		//부모클래스 변수의 값을 자식 클래스 변수에 대입불가
		//자바 컴파일러는 객체가 아니라 변수의 타입만 보고 대입 가능성을 검사
		//CheckingAccount obj2=obj;
		
		//래퍼런스 타입에 캐스트 연산자를 사용
		CheckingAccount obj2=(CheckingAccount) obj;
		try {
			int amount=obj2.pay("1234-1234-1234-1234",100000);
			System.out.println("인출액:"+amount);
			System.out.println("카드번호" +obj2.cardNo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
