package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		System.out.print("1번째 숫자를 입력하세요:");
		aa[0] = scanner.nextInt();
		System.out.print("2번째 숫자를 입력하세요:");
		aa[1] = scanner.nextInt();
		System.out.print("3번째 숫자를 입력하세요:");
		aa[2] = scanner.nextInt();
		System.out.print("4번째 숫자를 입력하세요:");
		aa[3] = scanner.nextInt();

		hap = aa[0] + aa[1] + aa[2] + aa[3];
		
//		
//		for (int i = 0; i < aa.length; i++) {
//			hap += aa[i];
//		}
		System.out.println(hap);
	}

}
