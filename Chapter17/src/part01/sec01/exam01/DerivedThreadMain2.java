package part01.sec01.exam01;
class DerivedThread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
				System.out.print(i+"\t");
		}
	}
}
public class DerivedThreadMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램시작");
		DerivedThread2 thread1=new DerivedThread2();
		DerivedThread2 thread2=new DerivedThread2();
		thread1.start();
		thread2.start();
		System.out.println("프로그램 종료");
		
	}

}
