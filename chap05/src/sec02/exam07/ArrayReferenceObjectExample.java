package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java"); // 똑같은 Java여도 string으로 지정을 해주면 참조위치가 달라진다

		System.out.println( strArray[0] == strArray[1]);    // true 참조가 같음
		System.out.println( strArray[0] == strArray[2]);    // false 참조가 다름
		System.out.println( strArray[0] .equals (strArray[2]) ); // true 문자열이 같다
	}

}
