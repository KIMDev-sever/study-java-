package part01.sec01.exam01;


class Car10 {
	String color;
	int speed;
	static int count = 0; //static 변수나 객체는 공유를 한다
						  //메모리상에서 젤먼저 만들어짐
						  //객체와는 별도로 쓸수있다.

	public Car10() {
		count++;
		speed++;
	}
}

public class Ex10_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car10 myCar1 = new Car10();
		System.out.println("현재 생산된 자동차 숫자==" + myCar1.count+" "+myCar1.speed);
		Car10 myCar2 = new Car10();
		System.out.println("현재 생산된 자동차 숫자==" + myCar2.count+" "+myCar2.speed);
		Car10 myCar3 = new Car10();
		System.out.println("현재 생산된 자동차 숫자==" + Car10.count+" "+myCar3.speed);
	}

}
