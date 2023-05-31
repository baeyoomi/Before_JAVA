package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);    //매개변수 바꿔치기
		//Vehicle vehicle = bus; 자동타입변환
	}

}
