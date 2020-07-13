package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.print("문자열 입력:");
		str = scanner.nextLine();
		System.out.printf("출력 문자열");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				System.out.printf("%c", '$');
			} else {
				System.out.printf("%c", str.charAt(i));
			}
		}
		scanner.close();
	}

}
