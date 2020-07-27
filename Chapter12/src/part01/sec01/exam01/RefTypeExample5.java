package part01.sec01.exam01;

public class RefTypeExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point obj = null;
		if (obj == null) {
			System.out.println("obj변수가 가리키는 객체는 없습니다.");
			return;
		}
		System.out.println("x=" + obj.x);
		System.out.println("y=" + obj.y);
	}

}
