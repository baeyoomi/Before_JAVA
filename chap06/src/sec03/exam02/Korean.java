package sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String name, String ssn) {
		this.name = name;    // 여기서 this자기자신의 name필드를 나타내는 인스턴스(아직까진 클래스라고도 볼수 있다) = 뒤에 name은 파라미터가 되었어욥
		this.ssn = ssn;
	}
	
	
	
}
