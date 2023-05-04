package sec02_exam07;

public class ForfloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			//(초기값; 최종값; 설정값;) 결과값을보면 소수단이 이상하게 떨어진다 수치 계산에 적합하지 않은 식에 예시다
			System.out.println(x);
		}
	}

}
