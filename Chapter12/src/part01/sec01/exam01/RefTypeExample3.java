package part01.sec01.exam01;

public class RefTypeExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// null 참조값 : 아무데이터도 가리키지 않는 참조값(약속된 단어)
//		Point obj;
//		System.out.println(obj.x); //컴파일 에러
//		System.out.println(obj.y);
		Point obj = null;
		System.out.println(obj.x); //런타임 에러
		System.out.println(obj.y);
	}

}
