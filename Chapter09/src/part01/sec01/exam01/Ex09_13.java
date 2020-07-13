package part01.sec01.exam01;

public class Ex09_13 {
	
	
	public static int a = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		func1();
		System.out.printf("main()에서 a의 값=%d", a);
	}

	public static void func1() {
		int a = 200; // 지역변수
		System.out.printf("func1()에서 a의값==%d\n", a);
	}
}
