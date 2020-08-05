package part01.sec01.exam04;

import java.util.HashSet;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			String str = name + age;
			String str2 = ((Person) obj).name + ((Person) obj).age;
			return str.equals(str2);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String str = name + ":" + age;
		return str.hashCode();
	}
}

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set = new HashSet<Object>();

		// set.add("abc");
		// set.add("abc");
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		System.out.println(set);

	}

}
