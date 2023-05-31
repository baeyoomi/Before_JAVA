package sec03.exam01;

public class SmartPhone extends Phone {
	//생성자   (추상클래스로 상속 받은 녀석은 반드시 객체생성시켜야한다)
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
