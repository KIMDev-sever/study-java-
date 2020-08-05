package part01.sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber2 {
	int num;

	public SimpleNumber2(int n) {
		// TODO Auto-generated constructor stub
		num = n;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return String.valueOf(num).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof SimpleNumber2) {

			return ((SimpleNumber2) obj).num == this.num;
		}
		return false;
	}
}

public class HashSetEqualityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<SimpleNumber2> hashSet = new HashSet<SimpleNumber2>();
		hashSet.add(new SimpleNumber2(30));
		hashSet.add(new SimpleNumber2(30));
		hashSet.add(new SimpleNumber2(20));

		System.out.println("저장된 데이터 수:" + hashSet.size());
		Iterator<SimpleNumber2> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
