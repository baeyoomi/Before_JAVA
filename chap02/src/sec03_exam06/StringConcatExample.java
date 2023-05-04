package sec03_exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//결합 연산   
		String str1 = 10 + 2 + "8";              // 10+2 = 12 + "8"(문자열로 인식) = 128  
		System.out.println("str1: " + str1);

		String str2 = 10 + "2" + 8;              // 10 + "2"(앞단에서 문자열로 인식) + 8 = 1028
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;              // "10"(첫단에서 문자열로 인식)+"2"+"8" = 1028   
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8);            // "10"(첫단에서 문자열로 인식)+ (2+8=10) = 1010
		System.out.println("str4: " + str4);
	}

}
