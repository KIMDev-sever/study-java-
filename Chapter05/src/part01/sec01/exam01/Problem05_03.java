package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Problem05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����(1),����(2),��(3)�� �ϳ��� �Է��ϼ���");
		String tmp = scanner.nextLine();
		int user = Integer.parseInt(tmp);
		if(user>=4){
			System.out.println("���ڰ� �߸��Ǽ� �ý��� ����");
			System.exit(0); //����޼ҵ�
		}
		int com = (int) ((Math.random() * 3) + 1); // random 0.0~1.0
		System.out.printf("����� %d�Դϴ�.\n", user);
		System.out.printf("���� %d�Դϴ�.\n", com);
		String message = "";
		switch (user - com) {
		case 0:
			message = "�����ϴ�.";
			break;
		case 1:
		case -2:
			message = "����� �̰���ϴ�.";
			break;
		case -1:
		case 2:
			message = "����� �����ϴ�.";
			break;
		default:
			break;
		}
		System.out.println(message);
	}

}
