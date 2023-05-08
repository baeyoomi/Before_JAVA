package sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;    //초기값을 지정 시켜주는것이 포인트
		for(int i=1; i<=100; i++) { //var i = 1;	
			sum += i; // sum = sum + i ;
		}	
		System.out.println(sum);
	}

}
