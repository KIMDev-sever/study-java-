package part01.sec01.exam01;

/*
 * 캡슐화(외부로부터 보호)
 * 필드에 직접 접근하지말고 메서드를 통해서 접근 유도
 */
class Car3 { // 같은패키지아래 클래스이름 중복 x
	private String color;// field 클래스에 선언된 변수
	private int speed;

	void upSpeed(int value) {
		speed += value;
	}

	void downSpeed(int value) {
		speed -= value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class Ex10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 myCar1 = new Car3();
		//myCar1.speed=100;
		myCar1.setSpeed(30);
		System.out.printf("자동차1의 색상은%s이며,현재속도는%dkm입니다. \n", myCar1.getColor(), myCar1.getSpeed());
	}

}
