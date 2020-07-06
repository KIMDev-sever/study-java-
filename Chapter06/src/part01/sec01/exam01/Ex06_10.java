package part01.sec01.exam01;

import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNum, endNum, increaseNum, hap = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값입력:");
		startNum = scanner.nextInt();
		System.out.print("끝값입력:");
		endNum = scanner.nextInt();
		System.out.print("증가값입력:");
		increaseNum = scanner.nextInt();
		for (int i = startNum; i <= endNum; i+=increaseNum) {
			hap += i;
		}
		System.out.printf("%d에서  %d까지 %d씩 증가한 값의 합: %d\n", startNum, endNum, increaseNum, hap);
		scanner.close();
	}

}
