package part01.sec01.exam02;

class Count {
	static int number = 3;
}

public class NoneShared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1 = new Count();
		System.out.println("c1.number=" + c1.number);
		c1.number++;
		System.out.println("c1.number=" + c1.number);
		Count c2 = new Count();
		System.out.println("c2.number=" + c2.number);
		c2.number++;
		System.out.println("c2.number=" + c2.number);
	}

}
