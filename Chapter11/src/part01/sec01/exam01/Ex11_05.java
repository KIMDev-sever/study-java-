package part01.sec01.exam01;

class Car5 {
	protected String color;
	int speed;
}

/*
 * 접근제어자가 protected로 설정되어있다면 protected가 붙은 변수,메서드는 동일 패키지내의 클래스 또는 해당 클래스를 상속받는
 * 외부패키지의 클래스에서 접근이 가능하다.
 */
class Sedan5 extends Car5 {

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void setColor(String color) {
		this.color = color;
	}
}

public class Ex11_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan5 sedan5 = new Sedan5();
		sedan5.setSpeed(300);
		sedan5.setColor("빨강");
		System.out.println("승용차 속도는" + sedan5.speed);
		System.out.println("승용차 색깔는" + sedan5.color);

		Car5 myCar5 = new Car5();
		myCar5.color = "red";
		System.out.println("승용차 색상===>" + myCar5.color);
	}

}
