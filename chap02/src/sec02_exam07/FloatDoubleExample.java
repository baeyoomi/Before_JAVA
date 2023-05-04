package sec02_exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14;    //f를 안붙였기 때문에 컴파일 에러 발생(Type mismatch)
		float var2 = 3.14f;
		double var3 = 3.14;     //double을 붙이면 에러 발생 안됌
		
		//정밀도 테스트
		float var4 = 0.123456789123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		double var6 = 3e6;    // 3000000.0 (3e6 = 3 0여섯개 .0)
		float var7 = 3e6F;    // 위와 같지만 float으로 표현
		double var8 = 2e-3;   // 0.002 (2e-3 = 2로 부터 -3번째 자리)
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}

}
