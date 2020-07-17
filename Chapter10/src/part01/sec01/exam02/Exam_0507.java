package part01.sec01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class Exam_0507 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		RoomMg room = new RoomMg();
		while (true) {
			System.out.println("1.입실 2.퇴실 3.보기 4.종료");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch (select) {
			case 1:
				room.input();
				break;
			case 2:
				room.output();
				break;
			case 3:
				room.view();
				break;
			case 4:
				room.exit();
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}

	}

}
