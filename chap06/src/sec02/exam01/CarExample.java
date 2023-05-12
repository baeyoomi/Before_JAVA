package sec02.exam01;

public class CarExample {
	//실행 클래스
	public static void main(String[] args) {
		Car myCar = new Car(); //객체 생성 기본 틀=생성자 호출하는 틀  (생성자는 클래스랑 이름이 같음)
		                       //Car라는 클래스 자료형
		                        
		//필드 값 읽기
		System.out.println("제작회사: " + myCar.company);    //myCar.company 는 필드
		System.out.println("모델명: " + myCar.model);      //myCar.company() 는 메소드
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);

		myCar.speed = 60;   //객체명이 앞으로 가야함
		System.out.println("현재속도: " + myCar.speed);
	}

}
