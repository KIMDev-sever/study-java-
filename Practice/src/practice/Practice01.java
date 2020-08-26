package practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("압축기준");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			if ((1 <= number) && (number <= 99)) {
				int ten=number/10;
				int one=number%10;
				int cal=((one*10)+ten)*2;
				compressionMessmage(cal);
			}

		}

	}

	public static void compressionMessmage(int size) {
		if (size <= 50) {
			System.out.println("GOOD");
		} else {
			System.out.println("OH MY GOD");
		}
	}

}
