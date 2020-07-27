package part01.sec01.exam01;

public class StringFormattingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String.format()메서드를 이용해서 포맷된 문자열 처리
		String s1=String.format("%s %d %f %o %h","Hello",100+100,3.14F,100,100);
		String s2=String.format("%,d",10000);
		String s3=String.format("%.3f", 42.00000);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
