package part01.sec01.exam02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] com = new int[6];
		int[] select = new int[6];
		int count = 0;
		for (int i = 0; i < com.length; i++) {
			int number = (int) (Math.random() * 45) + 1;
			com[i] = number;
			for (int j = 0; j < i; j++) {
				if ((com[i] == com[j])) {
					i--;
				}

			}
		}
		for (int i = 0; i < select.length; i++) {
			do {
				System.out.println(i + 1 + "번째수 입력");
				select[i] = scanner.nextInt(); //
			} while (select[i] < 1 || select[i] > 45);
			for (int j = 0; j < i; j++) {
				if ((select[i] == select[j])) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < select.length; i++) {
			for (int j = 0; j < com.length; j++) {
				if ((select[i] == com[j])) {
					count++;
				}
			}
			System.out.println(select[i] + "///" + com[i]);
		}
		System.out.println(count + "개를 맞추셨습니다");

	}

}
