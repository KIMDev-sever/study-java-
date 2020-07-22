package part01.sec01.exam02;

class A6 {
	public void aaa() {
		System.out.println("aaa");
	}

	public void bbb() {
		System.out.println("bbb");
	}
}

class B6 extends A6 {
	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb1");
	}

	public void ccc() {
		System.out.println("ccc");
	}
}

public class Round13_Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 ap=new B6();
		ap.aaa();
		ap.bbb();
		//ap.ccc();
	
	}

}
