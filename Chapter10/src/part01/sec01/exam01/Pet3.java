package part01.sec01.exam01;

public class Pet3 {
	private String type;
	private int age;
	static int count;
	public Pet3() {
		count++;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void move() {
		System.out.println(type + "가 움직입니다.");
	}

	int getAge() {
		return this.age;
	}

	static int getCount() { //static붙은애는 static 만처리해야된다 문법에러
		return count;
	}
}
