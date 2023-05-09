package sec01.exam01;

public class StringEqualsExample {
	//참조 변수에 대한 설명
	public static void main(String[] args) {
		String strVar1 ="배유미";
		String strVar2 ="배유미";

		if(strVar1 == strVar2) {   //== 는 참조 즉, 주소를 말하는 것이다.
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("배유미");
		String strVar4 = new String("배유미");
			if(strVar3 == strVar4) {
				System.out.println("strVar3과 strVar4는 참조가 같음");
			} else {
				System.out.println("strVar3과 strVar4는 참조가 다름");
			}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
