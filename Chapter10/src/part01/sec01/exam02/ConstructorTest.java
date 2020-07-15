package part01.sec01.exam02;

class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2() {
		// TODO Auto-generated constructor stub
	}

	Data2(int x) {
		value = x;
		System.out.println("생성자:"+value);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		//Data2 d2 = new Data2();
		Data2 d2 = new Data2(100);
		System.out.println(d2.value);
	}

}
