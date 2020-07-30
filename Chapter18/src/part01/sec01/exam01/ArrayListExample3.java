package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		int index1=list.indexOf("사과"); // 검색
		int index2=list.lastIndexOf("사과"); // 뒤에서 부터 검색
		System.out.println("첫번째사과:"+index1);
		System.out.println("마지막사과:"+index2);
	}

}
