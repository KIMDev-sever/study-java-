package part01.sec01.exam02;

public class StaticMethodExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("obj1.total=" + obj1.total);
		System.out.println("obj2.total=" + obj2.total);

		System.out.println("총계=" + grandTotal);
	}

}
