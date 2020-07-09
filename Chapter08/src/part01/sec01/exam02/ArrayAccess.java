package part01.sec01.exam02;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			max = arr[i] > max ? arr[i] : max;
		}
		System.out.printf("입력된수에서 가장 큰수는%d입니다.", max);
		scanner.close();

	}

}
