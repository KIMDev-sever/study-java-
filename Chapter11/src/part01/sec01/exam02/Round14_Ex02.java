package part01.sec01.exam02;

interface A2 {
	void aaa();

	public abstract void bbb();
}

class B3 implements A2 {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa메서드");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb메서드");
	}

}

public class Round14_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 b3 = new B3();
		b3.aaa();
		b3.bbb();
	}

}
