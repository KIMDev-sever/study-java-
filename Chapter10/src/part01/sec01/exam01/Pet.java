package part01.sec01.exam01;

public class Pet {
	String type;
	int age;

	void move() {
		System.out.println(type + "가 움직입니다.");
	}

	int getAge() {
		return this.age;
	}
}
