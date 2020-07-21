package part01.sec01.exam02;

class C1 {
	static int x;
	static int y;
}

class C2 extends C1 {
	static String x;
}

public class InheritanceTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2.x = "java programming";
		C1.x = 30000;
		C1.y = 20000;
		System.out.println("클래스 변수 C2.x값:" + C2.x);
		System.out.println("클래스 변수 C1.x값:" + C1.x);
		System.out.println("클래스 변수 C1.y값:" + C1.y);
		
	}

}
