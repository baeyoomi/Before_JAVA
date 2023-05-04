package sec03_exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// .parse대문자부터입력 , valueOf = 값 또는 숫자로 변환 (의미 값은 트루라고 읽을수 있고 문자열로 변환하면 티알유이 라고 읽을수 있음^^)
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}

}
