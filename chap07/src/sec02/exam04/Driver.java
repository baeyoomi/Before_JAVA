package sec02.exam04;
//메소드 (생성자 아님!)
public class Driver extends Vehicle{
	public void drive(Vehicle vehicle) {    // ver Vehicle vehicle = Bus bus 변수선언 
		vehicle.run();
	}
}
