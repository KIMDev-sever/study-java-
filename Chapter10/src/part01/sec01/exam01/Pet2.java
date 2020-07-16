package part01.sec01.exam01;

public class Pet2 {
	private String type;
	private int age;

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
}
