package sec02.exam02;

public class ArrayCreateByValueListExample2 {
	//int형태로 배열선언후 for문을 사용해 총합구하기
	public static void main(String[] args) {
		int[] scores;  
		scores = new int[]{ 83 , 90, 87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 100 , 100, 50});  //add라는 함수가 없어서 따로 만들어줌
		System.out.println("총합 : " + sum2);
	}
	public static int add(int[] scores) { //var score 파라미터가 활성화됐다는건 변수선언이 되었다는것       
		int sum = 0;                      //나중에 선언된 함수 
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
		
		
	}
}
