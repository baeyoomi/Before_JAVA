package sec02.exam06;
//instanceof
public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {         //instanceof소속이 어딘지 확인용, 이 전체가 맞다 하면 true
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);    //부모가 상속된게 아니라 변환되지 않았다고 함
		// method2(parentB); if문으로 확인 창 안만들었음, 안나옴         //예외 처리를 해 줄 것!
	}

}
