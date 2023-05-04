package sec02_exam01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011;      //2진수
		int var2 = 0206;        //8진수(10000110)
		int var3 = 365;         //10진수
		int var4 = 0xB3;        //16진수(10110011)
		//이렇게 입력하면 10진수로 계산해서 출력시킴

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}

}
