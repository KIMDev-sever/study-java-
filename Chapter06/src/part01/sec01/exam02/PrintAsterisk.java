package part01.sec01.exam02;

import java.util.Scanner;

public class PrintAsterisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오:");
		int num = scanner.nextInt();
		int num2;
		//num2 = num;
		if (num > 0) {
//			for (int i = 0; i < num; i++) {
//				for (int j = num2; j > 0; j--) {
//					System.out.print("*");
//				}
//				num2--;
//				System.out.println();
//			}

			for (int i = num; i >= 1; i--) {
				for (int j = i; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("0보다 커야합니다.");
		}
	}

}
