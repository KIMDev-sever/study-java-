package part01.sec01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result = 0;
		char cal;
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오:");
		a = scanner.nextInt();
		System.out.print("두번째 수를 입력하시오:");
		b = scanner.nextInt();
		try {
			System.out.print("산술연산자 입력:");
			cal = (char) System.in.read();
			switch (cal) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				result = a / b;
				break;
			case '%':
				result = a % b;
				break;
			}
			System.out.printf("%d %c %d = %d", a, cal, b, result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("에러");
			e.printStackTrace();
			
		}
		scanner.close();

	}

}
