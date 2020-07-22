package part01.sec01.exam02;

class Product {
	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {

	public Tv() {
		super(100);
		// TODO Auto-generated constructor stub
	}

	public String toString() { // object클래스의 toString()을 오버라이딩한다.
		return "Tv";
	}

}

class Computer extends Product {

	public Computer() {
		super(200);
		// TODO Auto-generated constructor stub
	}

	public String toString() { // object클래스의 toString()을 오버라이딩한다.
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();

		b.buy(tv);
		b.buy(com);
		System.out.println("현재 남은돈은 " + b.money + "입니다.");
		System.out.println("현재 포인트는 " + b.bonusPoint + "입니다.");
	}

}
