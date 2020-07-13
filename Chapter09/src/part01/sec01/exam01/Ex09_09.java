package part01.sec01.exam01;

public class Ex09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java Programming"; // 동일문자열은 메모리에 따로 생성하지않는다
		String str2="Java Programming"; //
		String str3=new String("Java Programming");
		System.out.println("원 문자열1[" + str1 + "]");
		System.out.println("원 문자열2[" + str2 + "]");
		System.out.println("원 문자열3[" + str3 + "]");
		System.out.println("원 문자열1==문자열2 결과: \t" + (str1==str2)); //주소값 비교
		System.out.println("원 문자열1.Equals(문자열2) 결과: \t" + (str1.equals(str2)));
		System.out.println("문자열1==문자열3결과: \t"+(str1==str3));
		System.out.println("원 문자열1.Equals(문자열3) 결과: \t" + (str1.equals(str3)));
	}

}
