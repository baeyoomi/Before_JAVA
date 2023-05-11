package sec02.exam04;

public class ArrayLengthExample {
//1차원 배열
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		// score.length = 5; 배열의 갯수는 한번 결정되면 바꿀 수 없음.
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;     //나눠지면 소주점 될수 있으니 형변환하여 double줌
		System.out.println("평균 : " + avg);
	}

}
