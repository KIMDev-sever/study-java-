package practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("숫자");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			if ((1 <= number) && (number <= 99)) {
				int mok = number / 10;
				int namuji = number % 10;
				switch (mok) {
				case 1:
					System.out.println(number+"th");
					break;
				default:
					if(namuji<4) {
						output(namuji,number);
					}else {
						System.out.println(number+"th");
					}
					break;
				}
			}

		}
	}
	
	public static void output(int namuji,int number) {
		switch (namuji) {
		case 1:
			System.out.println(number+"st");
			break;
		case 2:
			System.out.println(number+"ed");
			break;
		case 3:
			System.out.println(number+"rd");
			break;
		}
	}
}
