package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������� �Է�:");
		int year = scanner.nextInt();
		switch (year%12) {
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("ȣ����");
			break;
		case 7:
			System.out.println("�䳢");
			break;
		case 8:
			System.out.println("��");
			break;
		case 9:
			System.out.println("��");
			break;
		case 10:
			System.out.println("��");
			break;
		case 11:
			System.out.println("��");
			break;
		default:
			break;
		}
	}

}
