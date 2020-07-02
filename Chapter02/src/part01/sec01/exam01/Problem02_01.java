package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		int result;
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 계산할값 입력:");
		a=scanner.nextInt();
		System.out.print("두번째 계산할값 입력:");
		b=scanner.nextInt();
		System.out.print("세번째 계산할값 입력:");
		c=scanner.nextInt();
		System.out.print("네번째 계산할값 입력:");
		d=scanner.nextInt();
		result=a+b+c+d;
		System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);
		scanner.close();
	}

}
