package part01.sec01.exam01;

class Circle extends Object {
	int radius;

	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle obj2 = (Circle) obj;
			return obj2.radius == this.radius;
		}
		return false;
		
		// TODO Auto-generated method stub

	}
}

public class ObjectExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		if (obj1.equals(obj2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		/*
		 * object클래스의 equals메서드는 두객체를 비교할때 필드값이 아니라 참조값을 가지고 비교한다.
		 */
	}

}
