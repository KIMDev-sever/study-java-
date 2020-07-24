package part01.sec01.exam02;

class A8 {
	void autoPlay(I i) {
		i.play();
	}
}

interface I {
	public abstract void play();
}

class B8 implements I{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play in B class");
	}
	
}
class C3 implements I{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play in C class");
	}
	
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A8 a=new A8();
		a.autoPlay(new B8());
		a.autoPlay(new C3());

		
	}

}
