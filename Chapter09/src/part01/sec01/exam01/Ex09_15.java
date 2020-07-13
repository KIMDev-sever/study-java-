package part01.sec01.exam01;

public class Ex09_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		func1(a); //값을 전달하는 방식 call by value
		System.out.printf("func1()실행후에 a값:%d", a);
	}

	static void func1(int a) {
		a += 1;
		System.out.printf("전달받은 a:%d\n", a);

	}

}
