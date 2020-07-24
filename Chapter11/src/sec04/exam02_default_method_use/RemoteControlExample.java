package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc = new Audio();
		rc.setMute(true); 
		rc.turnOn();

	}

}
