package part01.sec01.exam01;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("사과");
		list.add("딸기");
		list.add(2,"키위");
		list.set(0,"오렌지"); //교체
 		list.remove(1); //해당데이터가 삭제되면 뒤에있는놈들은 한칸씩이동
		list.remove("키위");
		int num = list.size();
		for (int i = 0; i < num; i++) {
			System.out.println(list.get(i));
		}
	}

}
