package sec05.exam03;

public class Car {
	//static 사용시 주의 점 this.
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();     //기본 생성자가 있지만 넣어도 문제없음
		myCar.speed = 60;          //public static 이 있으니 this.를 붙일 수 없다
		myCar.run();
	}
}
