package part01.sec01.exam02;

class Car {
	String color;
	String gearType;
	int door;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String c, String g, int d) {
		// TODO Auto-generated constructor stub
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.color="white";
		car1.gearType="auto";
		car1.door=4;
		Car car2=new Car("white","auto",4);
		System.out.println("car1의 color="+car1.color+",gearType="+car1.gearType+",door="+car1.door);
		System.out.println("car2의 color="+car2.color+",gearType="+car2.gearType+",door="+car2.door);
	}

}
