package part01.sec01.exam01;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner scanner=new Scanner(System.in);
		System.out.print("ù��° ����Ұ� �Է�:");
		a=scanner.nextInt();
		System.out.print("�ι�° ����Ұ� �Է�:");
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
