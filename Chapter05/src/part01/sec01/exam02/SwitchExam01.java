package part01.sec01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result = 0;
		char cal;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ�:");
		a = scanner.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ�:");
		b = scanner.nextInt();
		try {
			System.out.print("��������� �Է�:");
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
			System.err.println("����");
			e.printStackTrace();
			
		}
		scanner.close();

	}

}
