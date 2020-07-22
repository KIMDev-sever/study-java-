package part01.sec01.exam02;

class Product2 {
	int price;
	int bonusPoint;

	public Product2(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	public Product2() {
		// TODO Auto-generated constructor stub
		price = 0;
		bonusPoint = 0;
	}

}

class Tv2 extends Product2 {
	public Tv2() {
		// TODO Auto-generated constructor stub
		super(100);
	}

	public String toString() {
		return "tv";
	}
}

class Computer2 extends Product2 {
	public Computer2() {
		super(200);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "computer";
	}
}

class Audio extends Product2 {

	public Audio() {
		super(50);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] items = new Product2[10];
	int i = 0;

	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;// 구매한 물품합계
		String itemList = "";
		for (int j = 0; j < items.length; j++) {
			if (items[j] == null) {
				break;
			}
			sum += items[j].price;
			itemList += items[j] + ",";
		}
		System.out.println(sum);
		System.out.println(itemList);
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b = new Buyer2();
		Tv2 tv = new Tv2();
		Computer2 computer = new Computer2();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(computer);
		b.buy(audio);
		b.summary();
	}

}
