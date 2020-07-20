package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

class Car3 {
	public Car3() {
		System.out.println("슈퍼클래스 생성자 호출 (파라미터 없음)");
	}

	Car3(String str) {
		System.out.println("슈퍼클래스 생성자 호출");
		System.out.println(str);
	}

}

class Sedan3 extends Car3 {
	Sedan3(String str) {
		// super()//기본적으로 파라미터 없는거 호출
		super(str);
		System.out.println("서브클래스 생성자 호출");
	}
}

public class Ex11_03 {

	public static void main(String[] args) {
		Sedan3 sedan3 = new Sedan3("여기요~~~~");
	}
}
