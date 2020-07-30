package part01.sec01.exam01;

import java.util.HashMap;
import java.util.Objects;

class Name {
	String firstName;
	String lastName;

	public Name(String firstName, String lastname) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastname;
	}

	@Override
	public int hashCode() { //get메소드 발동 hashcode 방찾음
		// TODO Auto-generated method stub
		return firstName.hashCode() + lastName.hashCode();
	}

	@Override
	public boolean equals(Object obj) { //get메소드 발동 그 키가 맞는냐
		// TODO Auto-generated method stub
		if(obj instanceof Name) {
			return ((Name) obj).firstName==this.firstName;
		}
		return false;
	}

}

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Name, Integer> hashTable = new HashMap<Name, Integer>();

		hashTable.put(new Name("해리", "포터"), new Integer(95));
		hashTable.put(new Name("헤르미온느", "그레인저"), new Integer(100));
		hashTable.put(new Name("론", "위즐리"), new Integer(85));
		hashTable.put(new Name("드레이코", "말포이"), new Integer(95));
		hashTable.put(new Name("네빌", "롱바텀"), new Integer(95));
		System.out.println(hashTable.get(new Name("헤르미온느", "그레인저")));
		// Name클래스가 object클래스로 부터 상속받은 hashCode를 그대로 사용
		// Name클래스가 해쉬 테이블의키로 사용하기에 부족

	}

}
