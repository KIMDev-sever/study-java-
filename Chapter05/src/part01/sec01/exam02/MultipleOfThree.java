package part01.sec01.exam02;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("수입력:");
		int num = scanner.nextInt();
		if ((num % 3) == 0) {
			System.out.println("3의배수임");
		} else {
			System.out.println("3의배수아님");
		}
		scanner.close();
	}

}
