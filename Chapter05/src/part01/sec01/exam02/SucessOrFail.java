package part01.sec01.exam02;

import java.util.Scanner;

public class SucessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�:");
		score=scanner.nextInt();
		if(score>=80) {
			System.out.println("�հ�!");
		}
		scanner.close();
	}

}
