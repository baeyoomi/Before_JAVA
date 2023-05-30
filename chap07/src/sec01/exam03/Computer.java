package sec01.exam03;

public class Computer extends Calculator {
	@Override    //메소드를 재조정하는 것
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
