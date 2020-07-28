package part01.sec01.exam01;

public class WrapperExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDouble(new Double(123.45));
		printDouble(12.1);
	}

	public static void printDouble(Double obj) {//auto Boxing
		System.out.println(obj.doubleValue());
	}
	
}
