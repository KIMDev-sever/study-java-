package part01.sec01.exam02;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D(1, 2, 3);
		String str = p3.getLocation();
		System.out.println(str);
	}

}

class Point {
	protected int x; // 다른패키지는 접근 불가 같은패키지밑 상속에선 접근허용 프로텍티드
	protected int y;
	// private int x;
	// private int y; //같은 클래스만

	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;

	}

	String getLocation() {
		return "x=" + x + ",y=" + y;
	}

}

class Point3D extends Point {
	private int z;

	@Override // 부모와 자식간에 오버라이딩시 무조건 자식께 사용됨
	// 재정의
	String getLocation() {
		// TODO Auto-generated method stub
		return "x=" + x + ",y=" + y + ",z=" + z;
	}

	public Point3D(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.z = z;
	}
}
