package sec06.exam05.package1;

public class B {
	//생성자에서 접근하는 방법
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1;      //프라이빗이니까 안대
		
		a.method1();
		a.method2();
		//a.method3();
	}
}
