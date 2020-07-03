package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수입력:");
		int num = scanner.nextInt();

		if ((num % 2) == 0) {
			System.out.println("짝수를 입력했다");
		} else {
			System.out.println("홀수를 입력했다");
		}
		scanner.close();
	}

}
