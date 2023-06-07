package sec02.exam02;

public class VehicleExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.dribe(bus);  //driver.drive(Vehicle vehicle = new Bus());
		driver.dribe(taxi);

	}

}
