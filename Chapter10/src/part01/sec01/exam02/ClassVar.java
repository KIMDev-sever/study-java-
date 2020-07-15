package part01.sec01.exam02;

class InstCnt {
	static int instNum = 0; //static 메모리상 가장 최상의 객체와는 별개

	public InstCnt() {
		// TODO Auto-generated constructor stub
		instNum++;
		System.out.println("인스턴스 생성"+instNum);
	}

}

public class ClassVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2= new InstCnt();
		InstCnt cnt3= new InstCnt();
	}
 
}
