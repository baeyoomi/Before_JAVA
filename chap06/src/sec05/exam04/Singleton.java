package sec05.exam04;
//싱글톤 시험에 나올거임
public class Singleton {          //싱글톤 생성하는 방법
	//정적 필드( 객체 생성을 통해서 생성한...) -외부에서 건들지못하게 private 사용 , 오직 한개만 만들수 있으니 static 입력
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적 메소드
	static Singleton getInstance() {
		return singleton;
	}
}
