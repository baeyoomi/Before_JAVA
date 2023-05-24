package sec03.exam04;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자       ----오버로딩
	Car(){
	}
	
	Car(String model) {
		//this.model = model;
		this(model, null, 0);
	}
	
	Car(String model, String color) {
		//this.model = model;
		//this.color = color;
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		//this(model, color, maxSpeed); 이건안됌 얘를 기준으로 위에 this잡았우니까
	}
	
	
}
