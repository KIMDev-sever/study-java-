package part01.sec01.exam01;

abstract class Car9 { // 추상 메소드를 가지고 있는
						// 클래스는 반드시 추상클래스가 되어야됨
	int speed = 0;
	String color;

	void upSpeed(int speed) {
		this.speed = speed;
	}

	abstract void work();
}

class Sedan9 extends Car9 {
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("타십시오 휴먼");
	}
}

class Truck4 extends Car9 {
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("짐을 실으십시오 휴먼");
	}

}

public class Ex11_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan9 sedan9 = new Sedan9();
		Truck4 truck4 = new Truck4();
		sedan9.work();
		truck4.work();
	}

}
