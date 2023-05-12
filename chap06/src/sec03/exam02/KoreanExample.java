package sec03.exam02;

public class KoreanExample {
//실행 클래스
	public static void main(String[] args) {
		Korean k1 = new Korean("배유미" , "930318-2000000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

		System.out.println("----------------------");
		
		Korean k2 = new Korean("하리보" , "230512-4000000");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
