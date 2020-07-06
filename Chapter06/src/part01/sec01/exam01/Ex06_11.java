package part01.sec01.exam01;

import java.util.Scanner;

public class Ex06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, dan;
		Scanner scanner = new Scanner(System.in);
		System.out.print("¸î´Ü?:");
		dan = scanner.nextInt();
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%dX%d=%d\n", dan, j, j * dan);

		}
	}

}
