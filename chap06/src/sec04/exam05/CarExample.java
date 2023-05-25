package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		//객체 외부에서 호출하는 방법
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");

	}

}
