package part01.sec01.exam02;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Argument {
	// StringBuffer 문자열 관련된 클래스
	public void change(int i, int j[], StringBuffer sb) {
		i = 20;
		j[3] = 400;
		sb.append("화이팅 자바");
	}

	public void display(int i, int j[], StringBuffer sb) {
		System.out.println("객체 변수 i의값:" + i);
		System.out.println("배열의 값");
		for (int k = 0; k < j.length; k++) {
			System.out.println(j[k] + "");
		}
		System.out.println();
		System.out.println("문자열 sb의값:" + sb);
	}
}

public class ArgumentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Argument d = new Argument();
		int a = 10;
		int b[] = { 1, 2, 3, 4 };
		StringBuffer c = new StringBuffer("배우기 쉽죠?");
		System.out.println("첫번재 display()메서드 호출");
		d.display(a, b, c);
		d.change(a, b, c);
		System.out.println("=====================================");
		System.out.println("값을 변환한다음 두번째 display()호출");
		d.display(a, b, c);
		
	}
//	static void test() {
//		String str="123213213";
//		try {
//			MessageDigest md=MessageDigest.getInstance("MD5");
//			md.update(str.getBytes());
//			System.out.println(md.digest()); 
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
