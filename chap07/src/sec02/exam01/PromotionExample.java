package sec02.exam01;

public class PromotionExample {
//타입 변환
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		//자동 형변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// B b3 = e;
		// C c2 = d; 사촌관계라서 적용불가
		
	}

}
