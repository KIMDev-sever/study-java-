package part01.sec01.exam02;

import java.util.Scanner;

public class Problem09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String str = new String(scanner.nextLine());
		String out = "";
		int len = Math.abs('A' - 'a');
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				out += (char) (str.charAt(i) - len);
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				out += (char) (str.charAt(i) + len);
			} else {
				out += (char) str.charAt(i);
			}
		}
		System.out.printf("내용을 거꾸로 출력==>%s", out);
		scanner.close();
	}

}
