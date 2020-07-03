package part01.sec01.exam02;

import java.util.Scanner;

public class SucessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("점수를 입력하시오:");
		score=scanner.nextInt();
		if(score>=80) {
			System.out.println("합격!");
		}
		scanner.close();
	}

}
