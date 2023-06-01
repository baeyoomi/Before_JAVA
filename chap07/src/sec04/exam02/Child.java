package sec04.exam02;

public class Child extends Parent {
	public String name;
	
	public Child() {      //파라미터 없이(명시적이지 않게) 상속 받았기 때문에 
		this("홍길동");     //자동생성되어 super가 숨어있다.
		System.out.println("Child() call");
	}
	
	public Child(String name) {      //이 아래는 명시적인 생성이 있으니 super가 없다.
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
