package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int cal_Number;
		int result=0;
		String cal = "";
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °è»êÇÒ°ª ÀÔ·Â:");
		a=scanner.nextInt();
		System.out.println("<1>µ¡¼À<2>»¬¼À<3>°ö¼À<4>³ª´°¼À");
		cal_Number=scanner.nextInt();
		System.out.print("µÎ¹øÂ° °è»êÇÒ°ª ÀÔ·Â:");
		b=scanner.nextInt();
		if(cal_Number==1) {
			cal="+";
			result=a+b;
		}
		if(cal_Number==2) {
			cal="-";
			result=a-b;
		}
		if(cal_Number==3) {
			cal="*";
			result=a*b;
		}
		if(cal_Number==4) {
			cal="/";
			result=a/b;
		}
		
		System.out.println(a+cal+b+"="+result);
		scanner.close();
	}

}
