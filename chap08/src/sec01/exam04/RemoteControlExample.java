package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;       //interface는 생성자를 만들수 없다
		rc = new Television();  //그래서 변수 선언후 타입에 집어넣는다
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
