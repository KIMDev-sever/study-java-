package part01.sec01.exam02;

class HundredNumbers {
	static int arr[];
	// 정적 초기화
	static {
		arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	// 클래스가 사용되기 전에 jvm에 의해 단 한번 호출됨
	// 정적 필드의 초깃값 설정에 주로사용됨
}

public class StaticInitilizerExample {
	public static void main(String[] args) {
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
	}
}
