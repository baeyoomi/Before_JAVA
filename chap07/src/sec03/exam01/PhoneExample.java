package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); (x) 여기선 생성안됌 - 일반 클래스 상속과의 차이점
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
