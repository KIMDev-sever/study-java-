package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,b;
		while (true) {
			System.out.print("더할 첫번째 수 입력:");
			a=scanner.nextInt();
			System.out.print("더할 두번째 수 입력:");
			b=scanner.nextInt();
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
	}

}
