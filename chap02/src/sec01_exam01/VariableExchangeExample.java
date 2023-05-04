package sec01_exam01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		//println 에 ln은 줄바꿈  ""따옴표 안에 문자는 콘솔뷰어에 그대로 출력됌
		
		int temp = x; // tamp = 3
		x = y; // x = 5
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}

}
