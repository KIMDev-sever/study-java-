package part01.sec01.exam02;

import java.util.Scanner;

public class PersonLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int len = 0;
		System.out.print("인원수를 입력");
		len = scanner.nextInt();
		String[] arr = new String[len];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 이름:");
			arr[i] = scanner.next();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 이름은 " + arr[i]+"님입니다");
		}
		scanner.close();
	}

}
