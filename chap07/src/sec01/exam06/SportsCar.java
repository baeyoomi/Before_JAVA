package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* @Override        -final이여서 오버라이드 안됌
	*public void stop() {     
	*	System.out.println("스포츠카를 멈춤");
	*	speed = 0;
	*}
	*/
}
