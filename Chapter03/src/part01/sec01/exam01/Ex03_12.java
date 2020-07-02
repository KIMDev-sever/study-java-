package part01.sec01.exam01;

public class Ex03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char c, d;
		a = 0xF90A; // 0x:16진수
		b = 0x50;
		c = (char) b;
		d = '#';
		System.out.printf("%c\n", a);
		System.out.printf("%c\n", b);
		System.out.printf("%c\n", c);
		System.out.printf("%c의 ASCII값:%d\n", d, (int) d);
	}

}
