package part01.sec01.exam01;

class Car8 {
	private int speed;
	private String color;
	//method overloading 
	//매서드 이름이 같고 매개 변수의 타입과 갯수가 다른것
	Car8() {

	}

	Car8(String color) {
		this.color = color;
	}

	Car8(String color, int speed) {// method overloading
		this.color = color;
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public String getColor() {
		return color;
	}
}

public class Ex10_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car8 myCar1 = new Car8();//
		Car8 myCar2 = new Car8("파랑", 0);
		Car8 myCar3 = new Car8("빨강");//
		System.out.printf("자동차1의 색상은%s이며,현재속도는%dkm입니다. \n", myCar1.getColor(), myCar1.getSpeed());
		System.out.printf("자동차2의 색상은%s이며,현재속도는%dkm입니다. \n", myCar2.getColor(), myCar2.getSpeed());
		System.out.printf("자동차3의 색상은%s이며,현재속도는%dkm입니다. \n", myCar3.getColor(), myCar3.getSpeed());
		
	}

}
