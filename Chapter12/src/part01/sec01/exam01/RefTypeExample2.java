package part01.sec01.exam01;

public class RefTypeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point obj = new Point(10, 20);
		System.out.printf("obj=(%d,%d)%n", obj.x, obj.y);
		//
		rearrange(obj);
		System.out.printf("obj=(%d,%d)%n", obj.x, obj.y);

	}

	public static void rearrange(Point point) {
		point.x = 30;
		point.y = 40;
	}
}
