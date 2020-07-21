package part01.sec01.exam01;

class Car4 {
	private String color;
	int speed;
}

class Sedan4 extends Car4 {

	void setSpeed(int speed) {
		this.speed = speed;
	}

//	void setColor(String color) {
//		// this.color=color
//	}
}

public class Ex11_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan4 sedan4 = new Sedan4();
		sedan4.setSpeed(300);
		System.out.println("승용차 속도는"+sedan4.speed);
	}

}
