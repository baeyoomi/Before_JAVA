package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();        //Child생성후 parent부모에게 들어감
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		// parent.field2 = "data2"; (x)     //Parent에 속한 자식은 자신만 가지고 있는걸 쓸수 없다
		// parent.method3();        (x)

		Child child = (Child) parent;       //child 부모에게서 나옴 
		child.field2 = "data2";   //(o)
		child.method3();          //(o)
		
	}

}
