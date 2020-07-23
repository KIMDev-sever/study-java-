package part01.sec01.exam02;

class Tv3 {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

interface Computer3 {
	public void dataReceive();
}

class Computer3Impl {

	public void dataReceive() {
		// TODO Auto-generated method stub
		System.out.println("영상 데이터 수신 중");
	}

}

class IPTV extends Tv3 implements Computer3 {
	Computer3Impl comp = new Computer3Impl();

	@Override
	public void dataReceive() {
		// TODO Auto-generated method stub
		comp.dataReceive();
	}

	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class MultiInheriAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv=new IPTV();
		iptv.powerOn();
		Tv3 tv = iptv;
		Computer3 comp = iptv;

	}

}
