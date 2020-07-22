package part01.sec01.exam02;
class Speaker { //final class 상속불가
	private int volumeRate;

	public void showCurrentState() {
		System.out.println("볼륨크기:" + volumeRate);
	}

	public void setVolumeRate(int volumeRate) {
		this.volumeRate = volumeRate;
	}

}

class BaseEnSpeaker extends Speaker {
	private int baseRate;

	public void showCurrentState() {
		// TODO Auto-generated method stub
		super.showCurrentState();
		System.out.println("베이스크기:" + baseRate);
	}

	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
}

public class Overrriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseEnSpeaker bs=new BaseEnSpeaker();
		bs.setVolumeRate(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	}

}
