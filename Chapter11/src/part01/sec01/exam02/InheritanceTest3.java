package part01.sec01.exam02;

class B1 {
	int x;
}

class B2 extends B1 {
	String x;
	//int x;
}

public class InheritanceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b2 = new B2();
		b2.x = "의지력을 갖고 공부를 안하면됨";
		System.out.println("객체 b2에 들어 있는 x값:" + b2.x);
		B1 b1 = new B1();
		b1.x = 5000;
		System.out.println("객체 b1에 들어 있는 x값:" + b1.x);
	}

}
