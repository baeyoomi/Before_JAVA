package sec01.exam03;

public interface RemoteControl {
	////상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnoff();
	void setVolume(int volume);
}
