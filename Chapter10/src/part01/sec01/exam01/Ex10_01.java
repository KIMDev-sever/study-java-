package part01.sec01.exam01;
class Car {
	Car() {
		
	}
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

public class Ex10_01 {

	public static void main(String[] args) {
		Car car1 = new Car(); //인스턴스화
		Car car2 = new Car(); //인스턴스화
		Car car3 = new Car(); //인스턴스화

		car1.setColor("빨강");
		car2.setColor("노랑");
		car3.setColor("파랑");
		car1.setSpeed(0);
		car2.setSpeed(0);
		car3.setSpeed(0);
		car1.upSpeed(30);
		car2.upSpeed(20);
		car3.downSpeed(10);
		System.out.printf("car1 speed:%d color:%s\n", car1.getSpeed(), car1.getColor());
		System.out.printf("car2 speed:%d color:%s\n", car2.getSpeed(), car2.getColor());
		System.out.printf("car3 speed:%d color:%s\n", car3.getSpeed(), car3.getColor());
	}

}
