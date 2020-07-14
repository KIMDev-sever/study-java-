package part01.sec01.exam01;

class Car7 {
	private int speed;
	private String color;

	Car7() {

	}

	Car7(String color, int speed) {//method overloading
		this.color=color;
		this.speed=speed;
	}

	public int getSpeed() {
		return speed;
	}

	public String getColor() {
		return color;
	}
}

public class Ex10_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car7 myCar1 = new Car7("빨강", 0);//
		Car7 myCar2 = new Car7("파랑", 0);

		System.out.printf("자동차1의 색상은%s이며,현재속도는%dkm입니다. \n", myCar1.getColor(), myCar1.getSpeed());
		System.out.printf("자동차2의 색상은%s이며,현재속도는%dkm입니다. \n", myCar2.getColor(), myCar2.getSpeed());
	}

}
