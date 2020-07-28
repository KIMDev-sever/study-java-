package part01.sec01.exam01;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("Usage:java Maxvalue<정수1><정수2>");
			return;
		}
		try {
			int num1 = Integer.parseInt(args[0]);
			//
			int num2 = Integer.parseInt(args[1]);
			if (num1 > num2) {
				System.out.println(num1);
			} else {
				System.out.println(num2);
			}
		} catch (Exception e) {
			System.out.println("Usage:java Maxvalue<정수1><정수2>");
		}
	}

}
