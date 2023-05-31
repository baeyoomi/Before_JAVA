package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// parent.method3(); 부모에게 소속이 되버림, 오버라이드 한 녀석(타입변환)이 우선순위가 된다, 위에서 Parent parent = child; 선언 안하면 사용가능하다
	}

}
