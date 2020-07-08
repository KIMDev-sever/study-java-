package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b;
		char ch;
		while (true) {
			System.out.print("계산할 첫번째 수 입력:");
			a = scanner.nextInt();
			System.out.print("계산할 두번째 수 입력:");
			b = scanner.nextInt();
			try {
				System.out.print("계산할 연산자 입력:");
				ch = (char) System.in.read();

				switch (ch) {
				case '+': {
					System.out.printf("%d%c%d=%d\n", a, ch, b, a + b);
					break;
				}
				case '*': {
					System.out.printf("%d%c%d=%d\n", a, ch, b, a * b);
					break;
				}
				case '-': {
					System.out.printf("%d%c%d=%d\n", a, ch, b, a - b);
					break;
				}
				case '/': {
					System.out.printf("%d%c%d=%.2f\n", a, ch, b, (double) a / b);
					break;
				}
				case '%': {
					System.out.printf("%d%c%d=%d\n", a, ch, b, a % b);
					break;
				}
				default:
					System.out.println("연산자를 잘s못 입력했습니다.");
					break;
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
