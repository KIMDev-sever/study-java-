package part01.sec01.exam01;

import java.util.Scanner;

public class Problem07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 여러개 입력:");
		String str = scanner.next();
		char ch;
		int i = 0, j = 0, num = 0;
		while (true) {

			if (i >= str.length()) {
				break;
			} else {
				ch = str.charAt(i);
				num = ch - '0';
				for (j = 0; j < num; j++) {
					System.out.print("*");
				}
				System.out.println();
				i++;
			}

		}
		scanner.close();

	}

}
