package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1;    //컴파일 에러        // char로 연산된 문자에 + 1을 했기 때문에 계산 안됌
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		//System.out.println("c3: " + c3);

	}

}
