package part01.sec01.exam01;

class Car7 {
	int speed = 0;

	final void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan7 extends Car7 {
	final static String CAR_TYPE = "승용차";

//	void upSpeed(int speed) {
//		//재정의 못함
//	}
}

public class Ex11_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sedan 클래스타입 ==>" + Sedan7.CAR_TYPE);
	}

}
