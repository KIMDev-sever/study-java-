package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int res;
		int oper, a, b;
		System.out.print("계산 입력(1:+,2:-,3:*,4:/):");
		oper = scanner.nextInt();
		System.out.println("첫번째 숫자를입력");
		a = scanner.nextInt();
		System.out.println("두번째 숫자를입력");
		b = scanner.nextInt();
		res = calc(a, b, oper);

		System.out.printf("계산 결과는:%d\n", res);
		scanner.close();
	}

	public static int calc(int a, int b, int oper) {
		int result = 0;
		switch (oper) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			result = a / b;
			break;

		default:
			System.out.println("잘못된 연산입니다.");
			break;
		}
		return result;
	}
}
