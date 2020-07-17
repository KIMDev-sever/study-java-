package part01.sec01.exam02;

import java.util.Scanner;

public class RoomMg {
	Scanner in;// 클래스의 필드값으로 객체(클래스가 올수있음);
	boolean room[];
	int roomCount;
	int roomNum;

	public RoomMg() {
		// TODO Auto-generated constructor stub
		in = new Scanner(System.in);

		System.out.println("방의 갯수를 입력:");
		roomCount = in.nextInt();
		room = new boolean[roomCount];
	}

	void input() {
		roomNum = 0;
		check(true);
		if (room[roomNum - 1]) {
			System.out.println(roomNum + "호실은 현재 사용중입니다.");
		} else {
			room[roomNum - 1] = true;
			System.out.println(roomNum + "호실에 입실하셨습니다.");
		}
	}

	void output() {
		check(false);
		if (!room[roomNum - 1]) {
			System.out.println(roomNum + "호실은 현재 빈방입니다.");
		} else {
			room[roomNum - 1] = false;
			System.out.println(roomNum + "호실을 퇴실하셨습니다.");
		}
	}

	void view() {
		int index = 0;
		for (boolean b : room) {
			String message = b ? "방은 사용중입니다." : "빈방입니다";
			System.out.println((++index) + message);

		}
	}

	void exit() {
		in.close();
		System.out.println("사용종료");
		System.exit(0);
	}

	void check(boolean sw) {
		String roomName = sw ? "입실" : "퇴실";
		boolean check = true;
		do {
			System.out.print(roomName + "하실 방의 번호를 입력");
			roomNum = this.in.nextInt();
			if (roomNum < 1 || roomNum > roomCount) {
				System.out.println(roomNum + "호실은 없습니다");

			} else {
				check = false;
			}

		} while (check);
	}
}
