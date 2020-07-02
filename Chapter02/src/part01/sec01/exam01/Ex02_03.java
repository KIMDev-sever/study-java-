package part01.sec01.exam01;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 계산할값 입력:");
		a=scanner.nextInt();
		System.out.print("두번째 계산할값 입력:");
		b=scanner.nextInt();
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
		scanner.close();
	}

}
