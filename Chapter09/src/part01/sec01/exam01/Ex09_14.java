package part01.sec01.exam01;

public class Ex09_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		func1();
		a = func2();
		System.out.printf("in형 메서드에서 돌려준 값:%d", a);
	}

	public static void func1() {
		System.out.printf("void형 메서드는 돌려줄게 없음\n");
	}

	public static int func2() {
		return 100;
	}
}
