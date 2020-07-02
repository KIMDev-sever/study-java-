package part01.sec01.exam01;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		int a,b,result;
		Scanner scanner=new Scanner(System.in);
		System.out.print("a:");
		a=scanner.nextInt();
		System.out.print("b:");
		b=scanner.nextInt();
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		result=a/b;
		System.out.println(a+"/"+b+"="+result);

	}

}
