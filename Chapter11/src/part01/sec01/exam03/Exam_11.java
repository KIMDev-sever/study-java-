package part01.sec01.exam03;

import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력:");
		String name = scanner.next();
		A11 ap = new A11("홍길동");
		if(name.equals(ap.getName())) {
			System.out.println("홍길동");
		}
		System.out.println(name);
		System.out.println(ap.getName());
	}

}
