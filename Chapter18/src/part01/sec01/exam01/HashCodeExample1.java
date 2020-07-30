package part01.sec01.exam01;

public class HashCodeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1=new String("헤르미온느");
		String obj2=new String("헤르미온느");
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
		//490927440값은 "헤르미온느"라는 문자열을 근거로
		//계산된 값이다.
	}

}
