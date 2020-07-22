package part01.sec01.exam02;

import java.util.Scanner;

abstract class Sport {
	String name;
	int age;
	String money;

	public Sport(String name, int age, String money) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.money = money;
	}

	public void printInfo() {
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("money=" + money);
	}

	abstract void playGame();
}

class BasketBall extends Sport {

	public BasketBall() {
		super("gemini", 20, "100만달러");
		printInfo();
		// TODO Auto-generated constructor stub
	}

	@Override
	void playGame() {
		// TODO Auto-generated method stub
		System.out.println(name + "가 손으로 공을 던집니다");
	}
}

class Soccer extends Sport {
	public Soccer() {
		super("son", 28, "9,263,261.28달러");
		printInfo();
		// TODO Auto-generated constructor stub
	}

	@Override
	void playGame() {
		// TODO Auto-generated method stub
		System.out.println(name + "가 발로 공을 찹니다");
	}
}

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasketBall gemini = new BasketBall();
		gemini.playGame();

		Soccer johnharu = new Soccer();
		johnharu.playGame();

	}

}
/*
 * 추상 클래스는 완전한 클래스가 아니라고 보면된다. 따라서 객체를 생성할수없다.
 * 완전한 클래스를 만들기위해서는 상속의 기법을 이용해서 모근 추상메서드를 구현하면 된다
 * 추상 클래스는 객체가 가지는 특성을 추상화 시켰을뿐 아직 구체화 시키지 못하는 클래스이다.
 * 
 */
