package part01.sec01.exam01;

interface Car10 {
	// int CAR_COUNT = 0;
	public static final int car_count = 0;

	public abstract void work(); // 추상메소드는 기본이 접근자가 public
}

class Sedan10 implements Car10 {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("승용차가 사람을 치었다");
	}

}

class Truck5 implements Car10 {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("트럭이 전복되었다");
	}

}

public class Ex11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan10 sedan10 = new Sedan10();
		Truck5 truck5 = new Truck5();
		sedan10.work();
		truck5.work();
	}

}
