package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b;
		while (true) {
			System.out.print("더할 첫번째 수 입력:");
			a = scanner.nextInt();
			System.out.print("더할 두번째 수 입력:");
			b = scanner.nextInt();
			System.out.printf("%d + %d = %d \n", a, b, a + b);
			if (scanner.nextInt() == 0) {
				break;
			}

		}
		System.out.println("0을 입력해서 반복문을 탈출했습니다");
	}

}
