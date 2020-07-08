package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("\n손님 주문하시겠음?");
			System.out.println("1.카페라떼 2.카푸치노 3.아메리카노 4 그만");
			menu = scanner.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("#카페라떼 주문");
				break;
			}
			case 2: {
				System.out.println("#카푸치노 주문");
				break;
			}
			case 3: {
				System.out.println("#아메리카노 주문");
				break;
			}
			case 4: {
				System.out.println("주문하신 커피 준비함");
				break;
			}
			default:
				System.out.println("잘못주문");
				break;
			}
		} while (menu != 4);
		scanner.close();
	}

}
