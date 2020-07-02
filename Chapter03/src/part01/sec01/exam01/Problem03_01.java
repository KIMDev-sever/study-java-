package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		// String convert_Str="";
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수입력:");
		result = scanner.nextInt();

		System.out.printf("10진수:%d\n", result);
		// convert_Str=Integer.toHexString(result); // Integer클래스 16진수 변환 메소드
		System.out.printf("16진수:%x\n", result);
		System.out.printf("16진수:%X\n", result);
		// convert_Str=Integer.toOctalString(result); // Integer클래스 8진수 변환 메소드
		System.out.printf("8진수:%o", result);
		scanner.close();
	}

}
