package part01.sec01.exam01;

public class MultithreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1=new DigitThread2();
		Thread thread2=new DigitThread2();
		Thread thread3=new AlphabetThread();
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
class AlphabetThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char i = 'A'; i < 'Z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000); // = settimeout
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
class DigitThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000); // = settimeout
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
