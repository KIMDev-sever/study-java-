package part01.sec01.exam01;

public class Ex04_03 {
	public static void main(String[] args) {
		int a=10;
		a++;//후위 연산자
		a=a+1;
		System.out.printf("a++:%d\n",a);
		++a;//전위 연산자
		System.out.printf("++a:%d\n",a);
		a--; //a=a-1;
		System.out.printf("a--:%d\n",a);
		a+=5;//a=a+5; 복합대입 연산자
		System.out.printf("a+=5:%d\n",a);
		a-=5;//a=a-5;
		System.out.printf("a-=5:%d\n",a);
		a*=5;//a=a*5;
		System.out.printf("a*=5:%d\n",a);
		a/=5;//a=a/5;
		System.out.printf("a/=5:%d\n",a);
		a%=5;//a=a%5;
		System.out.printf("a%%=5:%d\n",a);
	}
}
