package part01.sec01.exam01;

import java.util.HashMap;

public class IntroHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();
		hMap.put(new Integer(3),"나삼번");
		hMap.put(5,"윤오번");
		hMap.put(8,"박팔번");
		

		System.out.println("6학년3반8번 학생:"+hMap.get(new Integer(8)));
		System.out.println("6학년3반5번 학생:"+hMap.get(5));
		System.out.println("6학년3반3번 학생:"+hMap.get(3));
		hMap.remove(5);
		System.out.println("6학년3반5번 학생:"+hMap.get(5));
		
		
	}
	/*
	 * 해쉬 테이블 계산에는 hashCode 메서드가 사용된다.
	 * hashCode메서드는 object클래스에 선언되어 있는 메서드이다.
	 * 키값에 대해 hashCode메서드를 호출한다.
	 * 따라서 같은 키 값에 대해 hashCode메서드를 호출하면 항상 같은 값이 리턴한다.
	 */
}
