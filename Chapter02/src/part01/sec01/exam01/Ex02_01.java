package part01.sec01.exam01;

public class Ex02_01 {

	public static void main(String[] args) {
		 int a,b; // 변수(저장공간)
		 int result=0;
		 // 주석은:프로그램 실행과 관련 없다.
		 /* int a;
		  * int b; int:정수
		  */
		 a=100;//=연산자;
		 b=50;
		 result=a+b;
		 System.out.println(a+b);
		 System.out.print(result);
		 System.out.println("a+b="+result);
		 System.out.println(a+"+"+b+"="+result);
		 result=a-b;
		 System.out.println(a+"-"+b+"="+result);
		 result=a*b;
		 System.out.println(a+"*"+b+"="+result);
		 result=a/b;
		 System.out.println(a+"/"+b+"="+result);
	}

}
