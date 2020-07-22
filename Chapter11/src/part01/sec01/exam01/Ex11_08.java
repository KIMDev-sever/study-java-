package part01.sec01.exam01;

abstract class Car8 {
	int speed = 0;
	String color;

	void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan8{
	
}
class Truck3{
	
}
public class Ex11_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car8 car8 = new Car8()]
		Sedan8 sedan8=new Sedan8();
		System.out.println("승용차 인스턴스 생성");
		Truck3 truck3=new Truck3();
		System.out.println("트럭 인스턴스 생성");
	}

}
