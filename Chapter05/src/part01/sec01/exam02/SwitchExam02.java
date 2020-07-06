package part01.sec01.exam02;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char genderNo;
		String gender = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 주민번호를 입력하시오:");
		genderNo = scanner.nextLine().charAt(7);
		switch (genderNo) {
		case '1':
		case '3':
			gender = "남자";
			break;
		case '2':
		case '4':
			gender = "여자";
			break;
		default:
			gender = "외계인";
			break;
		}
		scanner.close();
		System.out.printf("당신은 %s입니다.", gender);
	}

}
