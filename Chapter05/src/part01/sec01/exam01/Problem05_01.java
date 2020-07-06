package part01.sec01.exam01;

import java.util.Scanner;

public class Problem05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result = 0;
		char cal;
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번쨰수입력:");
		a = scanner.nextInt();
		System.out.print("연산자입력:");
		cal = scanner.next().charAt(0);
		System.out.print("두번쨰수입력:");
		b = scanner.nextInt();
		if (cal == '+') {
			result = a + b;
		} else if (cal == '-') {
			result = a - b;
		} else if (cal == '*') {
			result = a * b;
		} else if (cal == '/') {
			result = a / b;
		} else if (cal == '%') {
			result = a % b;
		}
		System.out.println("전부 비교");
		System.out.printf("%d %c %d = %d입니다.", a, cal, b, result);
		scanner.close();
	}

}
