package sec02.exam03_multi_implement_class;

public interface RemoteControl {
	// 상수 public static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메서드 public abstract
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메서드 public
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}else {
			System.out.println("무음해제");
		}
	}
	//정적 메서드 public
	
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
