package part01.sec01.exam01;

public class Ex09_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " 한글 ABCD efgh  ";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i) == ' ' ? "" : str.substring(i, i + 1);
		}
		// result = str.replaceAll(" ", "");
		System.out.println("원 문자열[" + str + "]");
		System.out.println("공백제거[" + result + "]");
		System.out.println(result.substring(0,1));
	}

}
