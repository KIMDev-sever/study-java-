package part01.sec01.exam02;

class Box3 {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;

	public void increment() {
		idNum = ++boxID;
	}
}

public class Box3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();

		mybox1.increment();
		mybox2.increment();
		mybox3.increment();
		mybox4.increment();

		System.out.println("mybox1의 번호:" + mybox1.idNum);
		System.out.println("mybox2의 번호:" + mybox2.idNum);
		System.out.println("mybox3의 번호:" + mybox3.idNum);
		System.out.println("mybox4의 번호:" + mybox4.idNum);
		System.out.println("전체 박스의 갯수는" + Box3.boxID + "입니다");
	}

}
