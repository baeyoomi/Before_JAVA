package sec04.exam01;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		//this.name = name;
		super(name);       //자식에 부모가 가진 생성자가 없을경우 super를 써준다.
		this.studentNo = studentNo;
	}
	
}
