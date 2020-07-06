package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Problem05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위(1),바위(2),보(3)중 하나를 입력하세요");
		String tmp = scanner.nextLine();
		int user = Integer.parseInt(tmp);
		if(user>=4){
			System.out.println("숫자가 잘못되서 시스템 종료");
			System.exit(0); //종료메소드
		}
		int com = (int) ((Math.random() * 3) + 1); // random 0.0~1.0
		System.out.printf("당신은 %d입니다.\n", user);
		System.out.printf("컴은 %d입니다.\n", com);
		String message = "";
		switch (user - com) {
		case 0:
			message = "비겼습니다.";
			break;
		case 1:
		case -2:
			message = "당신이 이겼습니다.";
			break;
		case -1:
		case 2:
			message = "당신이 졌습니다.";
			break;
		default:
			break;
		}
		System.out.println(message);
	}

}
