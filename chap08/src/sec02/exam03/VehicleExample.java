package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동형변환
		
		vehicle.run();
		//vehicle.checkFare();
		
		Bus bus = (Bus) vehicle; //강제타입변환
		bus.run();
		bus.checkFare();       //타입 변환했기때문에 적영됌

	}

}
