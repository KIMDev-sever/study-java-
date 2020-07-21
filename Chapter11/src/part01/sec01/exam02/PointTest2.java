package part01.sec01.exam02;

class Point2 {
	int x = 10;
	int y = 20;

	Point2() {

	}

	public Point2(int x, int y) {
		// TODO Auto-generated constructor stub
		// super()//object
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z = 3;

	Point3D2() {
		this(100, 200, 300); //this(자기 자신의 생성자 호출)
		// TODO Auto-generated constructor stub
	}

	Point3D2(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.z = z;
	}
}

public class PointTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D2 p3 = new Point3D2();
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);

	}

}
