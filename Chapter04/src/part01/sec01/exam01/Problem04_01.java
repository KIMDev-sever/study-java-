package part01.sec01.exam01;

import java.util.Scanner;

public class Problem04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a, b;
		System.out.print("첫번째값입력:");
		a = scanner.nextDouble();
		System.out.print("두번째값입력:");
		b = scanner.nextDouble();
		System.out.printf("%.2f+%.2f=%.2f\n", a, b, a + b);
		System.out.printf("%.2f-%.2f=%.2f\n", a, b, a - b);
		System.out.printf("%.2f*%.2f=%.2f\n", a, b, a * b);
		System.out.printf("%.2f/%.2f=%.2f\n", a, b, a / b);
		System.out.printf("%d %% %d= %d\n", (int) a, (int) b, (int) (a % b));
		scanner.close();
	}

}
