package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		//new 를 쓰지않는 이유 , 생성자와 상관없는 정적멤버니까
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
