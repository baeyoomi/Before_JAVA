package sec02.exam01;

public class A {
	A() {System.out.println("A 객체가 생성됨");}
	
	/** 인스턴스 멤버 클래스 **/
	public class B {
		B() {System.out.println("B 객체가 생성됨");}
		int field1;
		// static int field2; 인스턴스 멤버 클래스 안에 넣으면 객체생성 규칙에 어긋나기때문에 컴파일 에러가 발생함
		void method1() { }
		// static void method2(){} 객체 생성도 안되는데 얘는 어케씀?ㅡㅡ
	}
	
	/** 정적 멤버 클래스 **/
	static class C {          // 여기에 static붙음
		C() {System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	void method() {       //얘는 그냥 변수취급,인스턴스임
		/** 로컬 클래스 **/
		class D {
			D() {System.out.println("D 객체가 생성됨");}
			int field1;
			// static int field2; 
			void method1() { }
			// static void method2(){} 
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
