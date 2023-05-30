package sec01.exam06;
//final 메소드는 오버라이드(재정의) 할 수 없다
public class Car {
	//필드
	public int speed;
	
	//생성자
	public void speedUp() {
		speed += 1;
	}
	
	//메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed=0;
	}
}
