package part01.sec01.exam02;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		int hap = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			hap += arr[i];
		}
		avg = (double) hap / arr.length;
		System.out.printf("배열 원소의 평균은 %.1f입니다.", avg);
		scanner.close();
	}

}
