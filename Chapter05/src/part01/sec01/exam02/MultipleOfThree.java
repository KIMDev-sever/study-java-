package part01.sec01.exam02;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���Է�:");
		int num = scanner.nextInt();
		if ((num % 3) == 0) {
			System.out.println("3�ǹ����");
		} else {
			System.out.println("3�ǹ���ƴ�");
		}
		scanner.close();
	}

}
