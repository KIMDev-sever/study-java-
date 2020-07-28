package part01.sec01.exam01;

public class AutoBoxingUnboxing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 10;
		Integer num2 = 20;
		// unboxing과 Boxing을 동시에 진행
		// num1++;
		num1 = new Integer(num1.intValue()+ 1) ;
		// num2+=3;
		num2 = new Integer(num2.intValue() + 3);

		int addResult = num1 + num2;
		System.out.println(addResult);

		int minResult = num1 - num2;
		System.out.println(minResult);
	}

}
