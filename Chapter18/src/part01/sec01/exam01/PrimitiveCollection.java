package part01.sec01.exam01;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10); // auto Boxing
		list.add(20);
		list.add(30);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer integer = itr.next();
			System.out.println(integer.intValue());
		}
	}

}
