package part01.sec01.exam02;

class A {
	int aa = 1;
}

class B extends A {
	int bb = 2;

}

class C extends B {
	int cc = 3;
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		System.out.println("obj객체의 객체 속성 변수 aa값은 " + obj.aa);
		System.out.println("obj객체의 객체 속성 변수 bb값은 " + obj.bb);
		System.out.println("obj객체의 객체 속성 변수 cc값은 " + obj.cc);
	}

}
