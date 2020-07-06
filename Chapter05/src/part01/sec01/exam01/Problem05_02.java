package part01.sec01.exam01;

import java.util.Scanner;

public class Problem05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b, result = 0;
		char ch;
		String[] str; // 배열(연속된 공간) index는0부터
		System.out.print("수식을 한줄로 띄어쓰기로 입력하세요:");
		str = scanner.nextLine().split(" "); // 10 + 30
		a = Integer.parseInt(str[0]);
		ch = str[1].charAt(0);
		b = Integer.parseInt(str[2]);

		switch (ch) {
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
		default:
			break;
		}
		System.out.printf("%d %c %d = %d입니다",a,ch,b,result);
	}

}
