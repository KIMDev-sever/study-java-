package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		// String convert_Str="";
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է�:");
		result = scanner.nextInt();

		System.out.printf("10����:%d\n", result);
		// convert_Str=Integer.toHexString(result); // IntegerŬ���� 16���� ��ȯ �޼ҵ�
		System.out.printf("16����:%x\n", result);
		System.out.printf("16����:%X\n", result);
		// convert_Str=Integer.toOctalString(result); // IntegerŬ���� 8���� ��ȯ �޼ҵ�
		System.out.printf("8����:%o", result);
		scanner.close();
	}

}
