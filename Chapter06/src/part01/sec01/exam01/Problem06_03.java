package part01.sec01.exam01;

import java.util.Scanner;

public class Problem06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("글자를입력:");
		String text = scanner.next();
		String reverseText = "";
		for (int i = (text.length() - 1); i >= 0; i--) {
			reverseText += text.charAt(i);
		}
		System.out.printf("입력한 문자열:%s\n", text);
		System.out.printf("변환된 문자열:%s", reverseText);
		scanner.close();
		
	}

}
