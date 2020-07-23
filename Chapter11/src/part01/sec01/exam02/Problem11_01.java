package part01.sec01.exam02;

class Pet {
	int age;

	public void move() {
		System.out.println("애완동물이 움직입니다.");
	}
}

class Dog extends Pet {
	String name;

	public int getWeight() {
		return weight;
	}

	int weight;
}

class Bird extends Pet {
	String type;
	boolean flightYN = true;

	boolean getFlight() {
		return flightYN;
	}
}

public class Problem11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.age = 25;
		dog1.name = "누렁이";
		dog1.weight = 10;
		Bird bird = new Bird();
		bird.age = 5;
		bird.type = "앵무새";
		bird.flightYN = true;

		dog1.move();
		bird.move();
		System.out.println("강아지의 이름은" + dog1.name + "고, 몸무게는" + dog1.getWeight() + "kg입니다.");
		System.out.println("새의 종류는" + bird.type + "고, 날 수" + (bird.getFlight() ? "있" : "없") + "습니다");
	}

};
