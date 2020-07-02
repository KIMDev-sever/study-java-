package part01.sec01.exam01;

public class Ex03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 200;
		double result;//자바에실수처리 기본형 double
		result = a / b;
		//실수와 정수는 처리하는 방식이 다름
		System.out.printf("%f\n", result);
		result=(double)a/b;//() casting 형변환
		System.out.printf("%f\n", result);
		//정수/정수 정 
		//정수/실수 실
		//실수/정수 실
		//실수/실수 실
		
	}

}
