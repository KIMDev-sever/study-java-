package part01.sec01.exam02;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char genderNo;
		String gender = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� �ֹι�ȣ�� �Է��Ͻÿ�:");
		genderNo = scanner.nextLine().charAt(7);
		switch (genderNo) {
		case '1':
		case '3':
			gender = "����";
			break;
		case '2':
		case '4':
			gender = "����";
			break;
		default:
			gender = "�ܰ���";
			break;
		}
		scanner.close();
		System.out.printf("����� %s�Դϴ�.", gender);
	}

}
