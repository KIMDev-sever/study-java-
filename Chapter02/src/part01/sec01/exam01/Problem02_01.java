package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		int result;
		Scanner scanner=new Scanner(System.in);
		System.out.print("ù��° ����Ұ� �Է�:");
		a=scanner.nextInt();
		System.out.print("�ι�° ����Ұ� �Է�:");
		b=scanner.nextInt();
		System.out.print("����° ����Ұ� �Է�:");
		c=scanner.nextInt();
		System.out.print("�׹�° ����Ұ� �Է�:");
		d=scanner.nextInt();
		result=a+b+c+d;
		System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);
		scanner.close();
	}

}
