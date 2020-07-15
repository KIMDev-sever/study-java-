package part01.sec01.exam02;

class Accumulator {
	int total = 0;
	static int grandTotal;

	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}

}

public class StaticFieldExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();

		obj1.accumulate(10);
		obj2.accumulate(20);
		System.out.println("obj1.total:"+obj1.total);
		System.out.println("obj1.total:"+obj1.grandTotal);
		System.out.println("obj2.total:"+obj2.total);
		System.out.println("obj2.total:"+obj2.grandTotal);
	}

}
