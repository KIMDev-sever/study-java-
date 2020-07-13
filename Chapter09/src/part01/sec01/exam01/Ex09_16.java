package part01.sec01.exam01;

class myInt {
	int a;
}

public class Ex09_16 {

	public static void main(String[] args) {
		myInt m = new myInt();
		m.a = 10;
		func1(m); //call by address(reference) 주소를 넘긴다
		System.out.printf("func1()실행후의 a=%d",m.a);
	}

	public static void func1(myInt m) {
		m.a += 1;
		System.out.printf("전달받은 a==>%d\n", m.a);
	}
}
