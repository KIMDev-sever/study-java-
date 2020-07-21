package part01.sec01.exam01;

class Car6 {
	int speed = 0;

	void upSpeed(int speed) { // final ==> 오버라이딩 금지
		this.speed = speed;
		System.out.println("현재속도(슈퍼클래스):" + this.speed);
	}
}

class Sedan6 extends Car6 {
	@Override
	void upSpeed(int speed) {
		// TODO Auto-generated method stub
		super.upSpeed(300);
		this.speed = speed;
		if (this.speed > 150) {
			this.speed = 150;
		}
		System.out.println("현재속도(서브클래스):" + this.speed);
	}
}

class Truck2 extends Car6 {

}

public class Ex11_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck2 truck2 = new Truck2();
		Sedan6 sedan6 = new Sedan6();
		System.out.print("트럭==>");
		truck2.upSpeed(200);
		System.out.print("승용차==>");
		sedan6.upSpeed(200);
	}

}
