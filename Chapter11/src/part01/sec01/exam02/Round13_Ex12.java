package part01.sec01.exam02;

class A7 {
	private int x = 100;
	private int y = 200;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println("x=" + x + "y=" + y);
	}

}

class B7 extends A7 {
	private int y = 300;
	private int z = 400;
	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void disp() {
		super.disp();
		System.out.println("y=" + y + "z=" + z);
		
	}

}

public class Round13_Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 ap = new B7();
		ap.disp();
		ap.setX(1);
		System.out.println();
		ap.disp();
		ap.setY(2);
		System.out.println();
		ap.disp();
	}

}
