package part01.sec01.exam02;

class InstCnt2 {
	static int instNum = 100;

	public InstCnt2() {
		// TODO Auto-generated constructor stub
		instNum++;
		System.out.println("인스턴스생성" + instNum);
	}
}

public class StaticValNoInst {
//static 변수의 초기화 시점
//JVM에 의해서 클래스가 메모리 공간에 올라가는 시점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstCnt2.instNum -= 15;
		System.out.println(InstCnt2.instNum);
	}

}
