package part01.sec01.exam01;

import java.util.Scanner;

public class Problem05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b, result = 0;
		char ch;
		String[] str; // �迭(���ӵ� ����) index��0����
		System.out.print("������ ���ٷ� ����� �Է��ϼ���:");
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
		System.out.printf("%d %c %d = %d�Դϴ�",a,ch,b,result);
	}

}
