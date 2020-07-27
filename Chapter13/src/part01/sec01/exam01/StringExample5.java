package part01.sec01.exam01;

public class StringExample5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Java");
		String str2 = new String("Java");
		System.out.println(str1);
		System.out.println(str2);
		if (str1.contentEquals(str2)) { // 문자열 상수
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
