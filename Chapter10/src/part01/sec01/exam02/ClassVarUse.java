package part01.sec01.exam02;

class Circle {
	static final double PI = 3.1415; // 고정된 상수값 공용으로 사용 가능
	private double radius;

	public Circle(double rad) {
		this.radius = rad;
	}

	public void showPerimeter() {
		double peri = (this.radius * 2) * PI;
	}

	public void showArea() {
		double area = (this.radius * this.radius) * PI;
		System.out.println("넒이:" + area);
	}
}

public class ClassVarUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle= new Circle(1.2);
		circle.showPerimeter();
		circle.showArea();
	}

}
