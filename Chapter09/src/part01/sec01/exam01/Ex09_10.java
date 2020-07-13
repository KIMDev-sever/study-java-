package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int coffee;
		int ret;
		System.out.println("어떤커피 드릴까요(1:보통,2:설탕,3:블랙)");
		coffee = scanner.nextInt();
		ret=coffe_machine(coffee);
		System.out.println("손님 커피 여기있습니다.");
		System.out.println("ret="+ret);
		scanner.close();
	}

	public static int coffe_machine(int button) {
		System.out.println("\n#1.(자동으로)뜨거운 물을 준비한다.");
		System.out.println("#2(자동으로)종이컵을 준비한다.");

		switch (button) {
		case 1:
			System.out.println("#3.(자동으로)보통 커피를 탄다.");

			break;
		case 2:
			System.out.println("#3.(자동으로)설탕 커피를 탄다.");
			break;
		case 3:
			System.out.println("#3.(자동으로)블랙 커피를 탄다.");
			break;

		default:
			System.out.println("#3.(자동으로)아무거나 탄다..");
			break;
		}
		System.out.println("#4.(자동으로) 물을 붓는다");
		System.out.println("#5.(자동으로) 스푼으로 저어서 녹인다 \n");
		return 0;
	}
}
