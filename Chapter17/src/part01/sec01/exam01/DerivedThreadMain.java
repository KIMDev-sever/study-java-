package part01.sec01.exam01;

class DerivedThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
				System.out.print(i+"\t");
		}
	}
}
public class DerivedThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램시작");
		DerivedThread thread=new DerivedThread();
		thread.start();
		System.out.println("프로그램 종료");
		
		//스레드는 메인이끝나는게 끝나는게 아니고 run이 끝나야 끝탐
	}

}
