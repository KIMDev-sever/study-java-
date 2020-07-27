package part01.sec01.exam01;

public class StringExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String 클래스의 문자열 처리 메소드개념 원본은 불변, 작업 완료시 새로운 데이터로 반환 String 객체가 가지고 있는 문자열의
		 * 내용을 바꾸는 것이 아니라 바뀐 내용을 갖는 새로운 문자열을 만들어서 리턴
		 */
		String str1 = " f ";
		String str2 = str1.trim();// 문자열 좌우 처리하는 메소드
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str2.concat("speaking Words of wisdom"));
		System.out.println(str2);
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e', 'a'));
		System.out.println(str1);
		System.out.println(str2);
	}

}
