package part01.sec01.exam02;

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x); // 10
		System.out.println("this.x=" + this.x); // 10
		System.out.println("super.x=" + super.x);// 10
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.method();
	}

}
