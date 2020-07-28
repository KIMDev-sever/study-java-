package part01.sec01.exam01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Rectangle {
	int width, height;

	public Rectangle(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	int getArea() {
		return this.width * this.height;
	}
}

public class ObjectExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(10, 20);
		Class cls = obj.getClass();
		// getClass메서드:객체가 속하는 클래스의 정보를 알아내는 메서드
		String name = cls.getName();

		System.out.println("클래스 이름:" + name);

		Class superCls = cls.getSuperclass();
		String superName = superCls.getName();
		System.out.println("슈퍼클래스 이름:" + superName);
		Field field[] = cls.getDeclaredFields();
		//클래스에 선언되어 있는 필드 정보를 가져오는 메서드
		for (Field field2 : field) {
			System.out.println(field2);
		}
		Method method[]=cls.getDeclaredMethods();
		//클래스에 선언되어 있는 메서드 정보를 가져오는 메서드
		for (Method method2 : method) {
			System.out.println(method2);
		}
		
	}
	//reflection(리플랙션):클래스의 생성자,필드,메서드 정보를 알아내는것

}
