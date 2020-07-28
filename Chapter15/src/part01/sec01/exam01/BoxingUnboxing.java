package part01.sec01.exam01;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iValue = new Integer(10); // Boxing;
		Double dValue = new Double(3.14);
		System.out.println(iValue);
		System.out.println(dValue);

		iValue = new Integer(iValue.intValue() + 10);// unboxing;
		dValue = new Double(iValue.floatValue() + 1.2);
		System.out.println(iValue);
		System.out.println(dValue);
	}

}
