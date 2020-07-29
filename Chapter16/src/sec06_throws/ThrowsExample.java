package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 클래스는 없습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException {

		Class clazz = Class.forName("java.lang.String2");

	}

}
