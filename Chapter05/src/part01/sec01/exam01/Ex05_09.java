package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~4 �߿� �����ϼ���");
		int selecter = scanner.nextInt();
		switch (selecter) {
		case 1: {
			System.out.println("1�� �����Ͽ���");
			break;
		}
		case 2: {
			System.out.println("2�� �����Ͽ���");
			break;
		}
		case 3: {
			System.out.println("3�� �����Ͽ���");
			break;
		}
		case 4: {
			System.out.println("4�� �����Ͽ���");
			break;
		}
		default: {
			System.out.println("�̻��Ѱ� ��������");
			break;
		}
		}
		scanner.close();
	}

}
