package part01.sec01.exam02;

import java.util.Scanner;

public class SwitchGrading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오:");
		int score = scanner.nextInt();
	
		switch (score/10) {
		case 9:
		case 10:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println(grade+"학점");
		scanner.close();

	}

}
