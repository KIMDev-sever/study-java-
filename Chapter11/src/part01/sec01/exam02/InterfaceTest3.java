package part01.sec01.exam02;

interface I1 {
	public abstract void methodB();
}

class A9 {
	void methodA() {
		I1 i = InstanceManager.getInstance();
		i.methodB();
	}
}

class B9 implements I1 {

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("method in B class");
	}

}

class InstanceManager {

	public static I1 getInstance() {
		// TODO Auto-generated method stub
		return new B9();
	}

}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9 a = new A9();
		a.methodA();
	}

}
