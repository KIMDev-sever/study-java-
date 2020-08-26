package practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수");
		int number = (scanner.nextInt() / 10);
		char garde;
		if ((0 <= number) && (number <= 100)) {
			switch (number) {
			case 10:
			case 9:
				garde='A';
				break;
			case 8:
				garde='B';
				break;
			case 7:
				garde='C';
				break;
			case 6:
				garde='D';
				break;
			default:
				garde='F';
				break;
			}
			System.out.println(garde);
		}
	
	}

}
