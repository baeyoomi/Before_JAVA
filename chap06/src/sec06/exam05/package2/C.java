package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;         //임폴트니까 돼
		// a.field2 = 1;      //디폴트니까 안대
		// a.field3 = 1;      //프라이빗이니까 안대
		
		a.method1();
		// a.method2();
		// a.method3();
	}
}
