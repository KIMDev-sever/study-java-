package part01.sec01.exam01;

import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNum, endNum, increaseNum, hap = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("���۰��Է�:");
		startNum = scanner.nextInt();
		System.out.print("�����Է�:");
		endNum = scanner.nextInt();
		System.out.print("�������Է�:");
		increaseNum = scanner.nextInt();
		for (int i = startNum; i <= endNum; i+=increaseNum) {
			hap += i;
		}
		System.out.printf("%d����  %d���� %d�� ������ ���� ��: %d\n", startNum, endNum, increaseNum, hap);
		scanner.close();
	}

}
