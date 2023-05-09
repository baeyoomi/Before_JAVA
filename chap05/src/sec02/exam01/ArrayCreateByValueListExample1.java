package sec02.exam01;

public class ArrayCreateByValueListExample1 {
    //배열 - int형태로 배열 선언하기
	public static void main(String[] args) {
		int[] scores = { 83 , 90, 87 };    // 선언과 동시에 값을 집어 넣는 방법
		//int[] scores1;
		//scores1 = { 83 , 90, 87 };       //변수처럼 먼저 선언을 하고 나중에 값을 넣는 것은 안됨
		int[] scores1;
		scores1 = new int[]{ 83 , 90, 87 }; //위와 같은 방식을 성립시키려면 참조변수 선언하듯 값을 넣으면 된다.
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}

}
