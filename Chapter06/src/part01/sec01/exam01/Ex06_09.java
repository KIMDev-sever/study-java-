package part01.sec01.exam01;

import java.util.Scanner;

public class Ex06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, hap = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("���Է�:");
		num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			hap += i;
		}
		System.out.printf("1����%d������ ��:%d\n", num, hap);
	}

}
