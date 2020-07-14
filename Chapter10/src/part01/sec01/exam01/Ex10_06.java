package part01.sec01.exam01;

class Car6{
	private int speed;
	private String color;
	
	Car6() {
		/*
		 * 생성자:무조건 실행 , 만약 없다면 컴파일러가 만들어서 삽입(우리눈엔 안보인다) 
		 * 생성자는 클래스 이름과 동일하다
		 * 생성자도 메서드의 한종류 void 쓰면 안된다.
		 * 생성자도 호출해야 작동한다.
		 * 생성자는 주로 객체 생성시 호출되어 필드초기화 담당
		 *
		 */
		speed = 0;
		color = "파랑";
	}
	Car6(int a,int b){
		
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class Ex10_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ()()
		 * (x_x)
		 * (o o)
		 * 
		 */
		Car6 myCar1 = new Car6();//객체 생성 및 생성자 호출
		Car6 myCar2 = new Car6(0,0);
//		myCar1.setColor("빨강");
//		myCar2.setColor("파랑");
//		myCar1.setSpeed(1000);
//		myCar2.setSpeed(10000);
		System.out.printf("자동차1의 색상은%s이며,현재속도는%dkm입니다. \n", myCar1.getColor(), myCar1.getSpeed());
		System.out.printf("자동차2의 색상은%s이며,현재속도는%dkm입니다. \n", myCar2.getColor(), myCar2.getSpeed());

	}

}
