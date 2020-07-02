package part01.sec01.exam01;

public class Ex03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		d = a + b + c;
		System.out.printf("a,b,c,d의값:%d,%d,%d,%d\n", a, b, c, d);
		a = b = c = d = 100;
		System.out.printf("a,b,c,d의값:%d,%d,%d,%d\n", a, b, c, d);

		a = 100;
		a = a + 200;// 강조
		System.out.printf("a의값:%d\n", a);
	}

}
