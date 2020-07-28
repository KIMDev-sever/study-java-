package part01.sec01.exam01;

public class WrapperExample1 {
	/*
	 * 하나의 래퍼 객체에는 하나의 프리미티브값을 담을 수 있는데 
	 * 그값은 생성자 파라미터로 넘겨 주어야 한다.
	 * 래퍼 객체가 생성되고 난 다음에 그 객체는 안에 있는 프리미티브
	 * 값을 바꿀수 없다.
	 */
	public static void main(String[] args) {
		Integer obj1=new Integer(12);
		Integer obj2=new Integer(7);
		
		int i=obj1.intValue();
		System.out.println(i);
	}
}
