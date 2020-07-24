package sec02.exam01_name_implement_class;

import sec02.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
