package part01.sec01.exam01;

class Car5 {
	private int speed = 0;

	public void upSpeed(int value) {
		// public이 없을때 같은 패키지 내 클래스들은 메소드 접근 가능
		// public 선언시 모든 패키지에서 접근 가능
		if (speed + value > 200) {
			speed = 200;
		} else {
			speed += value;
		}
		System.out.printf("현재속도:%d\n", getSpeed());
	}

	public void downSpeed(int value) {
		if (speed - value < 0) {
			speed = 0;
		} else {
			speed -= value;
		}
		System.out.printf("현재속도:%d\n", getSpeed());
	}

	public int getSpeed() {
		return this.speed;
	}
}

public class Ex10_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 myCar1 = new Car5();
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
	}

}
