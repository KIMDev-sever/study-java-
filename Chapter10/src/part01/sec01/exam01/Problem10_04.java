package part01.sec01.exam01;

import java.util.Scanner;

class MyName {
	private String name;

	public MyName(String name) {
		this.name = name;
		String message = getName().equals("홍길동") ? "입력하신 이름과 같습니다." : "입력하신 이름과 다릅니다.";
		System.out.println(message);
	}

	public String getName() {
		return name;
	}
}

public class Problem10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력:");
		new MyName(scanner.next());
		scanner.close();
	}

}
