package part01.sec01.exam01;

import java.awt.Frame;

/*
 * Frame상속과 Runnable의 구현
 * Thread를 상속하지 못하는 경우 Runnable로 구현
 */
class RunFrame extends Frame implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("스레드 시작");
		while (i < 20) {
			System.out.print(i + "\t");
			this.setTitle("스레드동작중" + i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println("스레드 종료");
		}
	}
}

public class RunFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunFrame r=new RunFrame();
		r.setSize(300,300);
		r.setVisible(true);

		Thread thread = new Thread(r);
		thread.start();
	}

}
