package sec03_exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// 자동형변환(프로모션)
		// byte의 범위는 127까지이나 최종 long으로 선언했기 때문에 계산식이 가능하다
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		// byte result = value1 + value2 + value3;     // 오류
		// float result = value1 + value2 + value3;    // 위 식에서 사용되지않은 더 큰 범위도 계산가능
		System.out.println(result);

	}

}
