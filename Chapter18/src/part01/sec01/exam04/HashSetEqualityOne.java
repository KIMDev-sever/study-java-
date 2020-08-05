package part01.sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
	int num;
	public SimpleNumber(int n) {
		// TODO Auto-generated constructor stub
		num=n;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}
}
public class HashSetEqualityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<SimpleNumber> hashSet=new HashSet<SimpleNumber>();
		hashSet.add(new SimpleNumber(30));
		hashSet.add(new SimpleNumber(30));
		hashSet.add(new SimpleNumber(20));

		System.out.println("저장된 데이터 수:" + hashSet.size());
		Iterator<SimpleNumber> iterator=hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
