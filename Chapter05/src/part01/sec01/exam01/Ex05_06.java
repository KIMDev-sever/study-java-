package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է�:");
		int num = scanner.nextInt();

		if ((num % 2) == 0) {
			System.out.println("¦���� �Է��ߴ�");
		} else {
			System.out.println("Ȧ���� �Է��ߴ�");
		}
		scanner.close();
	}

}
