package part01.sec01.exam01;

import java.util.Scanner;

public class Problem07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int start, end, basu, i, hap = 0;
		System.out.print("합계의 시작값:");
		start = scanner.nextInt();
		System.out.print("합계의 끝값:");
		end = scanner.nextInt();
		System.out.print("배수:");
		basu = scanner.nextInt();
		i = start;
		while (i <= end) {
			if (i % basu == 0) {
				hap += i;
			}
			i++;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계:%d", start, end, basu, hap);
		scanner.close();
	}

}
