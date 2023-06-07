package sec01.exam06;

public class MyClass {
	//다형성
	//필드에 넣는 방법
	RemoteControl rc = new Television();
	
	//생성자에 매개값을 넣는 방법
	MyClass() {
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드 (로컬변수에 값을 넣는 방법)
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드 (매개변수에 값을 넣는 방법)
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
