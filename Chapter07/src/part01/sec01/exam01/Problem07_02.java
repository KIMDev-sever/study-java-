package part01.sec01.exam01;

import java.util.Scanner;

public class Problem07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		char ch;
		int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0;
		int i = 0;
		System.out.print("문자열 입력");
		str = scanner.next();
		do {
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper_cnt++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower_cnt++;
			} else if ((ch >= '0' && ch <= '9')) {
				digit_cnt++;
			}
			i++;
		} while (i < str.length());
		System.out.printf("대문자%d개,소문자%d개,숫자%d개", upper_cnt, lower_cnt, digit_cnt);
	}

}
