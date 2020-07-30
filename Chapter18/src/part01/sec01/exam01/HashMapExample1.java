package part01.sec01.exam01;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashtable=new HashMap<String, Integer>();
		hashtable.put("해리", new Integer(95));
		hashtable.put("헤르미온느", new Integer(100));
		hashtable.put("론", new Integer(85));
		hashtable.put("드레이코", new Integer(93));
		hashtable.put("네빌", new Integer(70));
		Integer num=hashtable.get("헤르미온느");
		System.out.println("헤르미온느 성적은 ? "+num);
		/*
		 * hashCode메서드는 Object클래스에 선언되어 있는 메서드로서 HashMap클래스의 
		 * put,get,remove메서드가 통번호를 계산할때 사용된다. 즉 키값으로 넘겨진 객체에
		 * 대해 hashCode가 호출된다
		 */
;	}

}
