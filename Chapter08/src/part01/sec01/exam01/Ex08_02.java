package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] aa = new int[4];
		int hap = 0;
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요:", i+1);
			aa[i] = scanner.nextInt();
			hap += aa[i];
		}

		// hap = aa[0] + aa[1] + aa[2] + aa[3];
		System.out.println(hap);
	}

}
