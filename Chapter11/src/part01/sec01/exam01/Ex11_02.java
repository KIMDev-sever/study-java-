package part01.sec01.exam01;

class Car2 {
	public Car2() {
		// TODO Auto-generated constructor stub
		System.out.println("슈퍼클래스 생성자 호출");
	}
}

class Sedan2 extends Car2 {
	public Sedan2() {
		System.out.println("서브클래스 생성자 호출");
	}
}

public class Ex11_02 {

	public static void main(String[] args) {
		Sedan2 sedan2=new Sedan2();
	}
}
