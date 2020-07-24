package sec02.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		tv.turnOn();
		tv.turnOff();
		tv.search("www.naver.com");
		rc.setMute(true);
		searchable.search("www.goole.com");
	}
}
