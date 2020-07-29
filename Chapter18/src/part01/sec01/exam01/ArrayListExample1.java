package part01.sec01.exam01;

import java.util.ArrayList;

//list : 데이터를 일렬로 늘어놓은 자료구조
public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("사과");
		list.add("딸기");
		int num = list.size();
		for (int i = 0; i < num; i++) {
			System.out.println(list.get(i));
		}
	}
}
