package part01.sec01.exam02;

public class ArrayExample2 {
	
	public static void main(String[] args) { // 프로그램 실행 시작
		// TODO Auto-generated method stub
		// void main () {} 메소드 기능
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0; // 지역변수 (선언된 구역에서 만 사용할수있다)
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:" + sum1);
		int sum2 = add(scores);
		System.out.println("총합:" + sum2);
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
