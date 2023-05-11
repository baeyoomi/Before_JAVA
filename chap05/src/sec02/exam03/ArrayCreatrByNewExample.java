package sec02.exam03;

public class ArrayCreatrByNewExample {

	public static void main(String[] args) {
		//int형으로 배열이름이 arr1 참조배열 형태의 선언 길이 3개 짜리를 선언해보세요.
		int[] arr1 = new int[3];   //위 문제의 답 int[] arr1 = new int[3];
		
		for(int i=0; i<3; i++) {        //for문으로 초기값,설정값,증가값 지정하여 프린트하기
			System.out.println("arr1[" + i + "] : " + arr1[i]);   //int형은 선언만하고 값을 안넣으면 0이 나옴
		}

		
		//double형으로 arr2라는 참조배열 형태의 선언길이 3개 짜리를 선언해보세요. 
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);   //double형은 선언만하고 값을 안넣으면 0.0이 나옴
		}
		
		arr2[0] = 0.1;             // 중요!!!!   배열특징: 한번 배열갯수가 결정되면 못바꾼다
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("");

		//문자열을가지는 배열이름이 arr3 참조배열 형태의 선언 길이 3개 짜리를 선언해보세요.
		String[] arr3 = new String[3];
		arr3[0] = "일";
		arr3[1] = "이";
		arr3[2] = "삼";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println("");
	}

}
