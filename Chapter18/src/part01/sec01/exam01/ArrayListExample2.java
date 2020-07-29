package part01.sec01.exam01;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("사과");
		list.add("딸기");
		list.add(2,"키위");
		list.set(0,"오렌지");
		list.remove(1);
		list.remove("키위");
		int num = list.size();
		for (int i = 0; i < num; i++) {
			System.out.println(list.get(i));
		}
	}
}
