package part01.sec01.exam02;

class Car2 {
	String color;
	String gearType;
	int door;

	Car2() {
		// TODO Auto-generated constructor stub
		this("white", "auto", 4);// 다른생성자 호출 this(매개변수 유무)
	}

	Car2(String color) {
		this(color, "auto", 4);
	}

	Car2(String color, String gearType, int door) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1 = new Car2();
		Car2 car2 = new Car2("blue");
		System.out.println("car1의 color=" + car1.color + ",gearType=" + car1.gearType + ",door=" + car1.door);
		System.out.println("car2의 color=" + car2.color + ",gearType=" + car2.gearType + ",door=" + car2.door);
	}

}
