package part01.sec01.exam01;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java"; //문자열 리터럴
		String str2="Java"; //문자열 똑같은땐 메모리 상에선 하나만 만들었기 때문에 주소값이 같으므로 같음
		System.out.println(str1);
		System.out.println(str2);
		if(str1==str2) { //문자열 상수
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}
