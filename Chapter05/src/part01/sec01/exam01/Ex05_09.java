package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~4 중에 선택하세요");
		int selecter = scanner.nextInt();
		switch (selecter) {
		case 1: {
			System.out.println("1을 선택하였음");
			break;
		}
		case 2: {
			System.out.println("2을 선택하였음");
			break;
		}
		case 3: {
			System.out.println("3을 선택하였음");
			break;
		}
		case 4: {
			System.out.println("4을 선택하였음");
			break;
		}
		default: {
			System.out.println("이상한걸 선택했음");
			break;
		}
		}
		scanner.close();
	}

}
