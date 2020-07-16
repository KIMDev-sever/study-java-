package part01.sec01.exam02;

class NumberPrinter {
	public static void showInt(int a) {
		System.out.println(a);
	}

	public static void showDouble(double a) {
		System.out.println(a);
	}
}

public class ClassMethod {

	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);
	}
}
