package part01.sec01.exam01;

import java.util.Scanner;

public class Problem05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result = 0;
		char cal;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù�������Է�:");
		a = scanner.nextInt();
		System.out.print("�������Է�:");
		cal = scanner.next().charAt(0);
		System.out.print("�ι������Է�:");
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
		System.out.println("���� ��");
		System.out.printf("%d %c %d = %d�Դϴ�.", a, cal, b, result);
		scanner.close();
	}

}
