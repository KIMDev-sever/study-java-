package part01.sec01.exam02;

public class CircleArea {

	public static void main(String[] args) {
		final double PI=3.14; //final 상수처리
		double radius=10;//반지름
		double circleArea=0;//원의면적
		circleArea=radius*radius*PI;
		
		System.out.printf("원의 면적=");
		System.out.println(circleArea);
	}

}
