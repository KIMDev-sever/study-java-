package part01.sec01.exam02;

public class MethodExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Numbers numbers = new Numbers(arr);
		int total = numbers.getTotal();
		int average = numbers.getAverage();
		System.out.println("합계:" + total);
		System.out.println("평균:" + average);

	}
	

}
