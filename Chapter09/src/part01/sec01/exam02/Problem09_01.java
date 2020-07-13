package part01.sec01.exam02;

import java.util.Scanner;

public class Problem09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String str = new String(scanner.nextLine());
		String tt = new String();
		for (int i = (str.length()-1); i >= 0; i--) {
			tt+=str.charAt(i);
		}
		System.out.printf("내용을 거꾸로 출력==>%s",tt);
	}

}
