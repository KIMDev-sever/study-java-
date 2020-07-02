package part01.sec01.exam01;

public class Ex03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a, b, c, d, e; // char(2byte);
		int f;
		a = 'A';
		System.out.printf("%c\t", a);
		System.out.printf("%d\t", (int) a);// ascii code
		System.out.println(a);
		b = 'a';// 97
		c = (char) (b + 1);
		System.out.printf("%c\t", b);
		System.out.printf("%c\t", c);
		// f=b+1;
		// System.out.println(f);
		d = 90;
		System.out.printf("%c\t\n", d);

		d = '°¡';
		e = (char) (d + 1);
		System.out.printf("%d\t", (int)d);
		System.out.printf("%c\t", e);

	}

}
