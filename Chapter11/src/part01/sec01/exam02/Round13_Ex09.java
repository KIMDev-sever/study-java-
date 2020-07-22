package part01.sec01.exam02;

class A4 {
	int x = 100;

	public void aaa() {

	}

	public void bbb() {

	}
}

class B4 extends A4 {
	int y = 200;

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("저는 오버라이드된 메서드입니다.");
		System.out.println(y);
	}

	public void ccc() {
		System.out.println("다형성일때 저는 사용 할 수 없어요, 오버라이드 시켜주세요");
	}

}

public class Round13_Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 ap = new B4(); // 다형적 표현
		System.out.println("x=" + ap.x);
		ap.aaa();
		ap.bbb();
		//ap.ccc();
	}

}
