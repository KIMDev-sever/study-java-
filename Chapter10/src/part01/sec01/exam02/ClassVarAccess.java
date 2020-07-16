package part01.sec01.exam02;

class AccessWay {
	static int num = 0;

	AccessWay() {
		incrCnt();
	}

	public void incrCnt() {
		num++;
	}
}

public class ClassVarAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AccessWay way = new AccessWay();
		//way.num++;
		AccessWay.num++;
		System.out.println("num=" + AccessWay.num);
	}

}
