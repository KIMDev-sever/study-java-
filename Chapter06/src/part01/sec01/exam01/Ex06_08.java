package part01.sec01.exam01;

public class Ex06_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;

		for (int i = 500; i <= 1000; i++) {
			hap += (i % 2 == 1) ? i : 0;
		}
		System.out.printf("500에서 1000까지의 홀수의합:%d", hap);
	}

}
