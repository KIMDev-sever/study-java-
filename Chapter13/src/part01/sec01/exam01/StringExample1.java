package part01.sec01.exam01;

public class StringExample1 {
	public static void main(String[] args) {
		String str = "Java Coffee";
		//문자열을 대입하면 자동으로 String 객체로 만들어진다.
		int len=str.length();
		
		for (int i = 0; i < len; i++) {
			System.out.println(str.charAt(i));
	
		}
	}
}
