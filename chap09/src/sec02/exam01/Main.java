package sec02.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체생성
		A.B b = a.new B();     //a자 생성없이 B가 존재할수 없음
		b.field1 = 3;
		b.method1();
		
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C(); // 
		c.field1 = 3;	   // 이것도 되고	
		A.C.field2 = 3;    // 이것도 됌
		c.method1();       // 이것도 되고
		A.C.method2();     // 이것도 됌

		// 로컬 클래스 
		a.method();
	}

}
