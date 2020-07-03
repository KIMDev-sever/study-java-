package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수입력:");
		char grade;
		int score = scanner.nextInt();
		if (score >= 90) {
			grade='A';
		} else if (score >= 80) {
			grade='B';
		} else if (score >= 70) {
			grade='C';
		} else if (score >= 60) {
			grade='D';
		} else {
			grade='F';
		}
		System.out.println(grade+"학점 입니다.");
		scanner.close();
	}

}
