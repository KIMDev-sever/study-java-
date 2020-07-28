package part01.sec01.exam01;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iValue = 10; // auto boxing
		Double dValue = 3.14;

		System.out.println(iValue);

		int num1 = iValue; // auto Unboxing
		double num2 = dValue;
		System.out.println(num1);
		System.out.println(num2);
	}

}
