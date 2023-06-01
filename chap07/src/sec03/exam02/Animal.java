package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();            //추상메소드 특징 - 상속받으면 반드시 오버라이딩 해야한다
	                                         //           - 실행블럭이 없다

}
