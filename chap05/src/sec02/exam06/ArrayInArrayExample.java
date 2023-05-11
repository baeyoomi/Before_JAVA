package sec02.exam06;
//2차원 배열     - 정방형
public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];      //1,2층이 같은건 따로 열 길이 지정을 안한다
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" +i+ "]["+k+"]="+mathScores[i][k]);
			}
		}
			System.out.println();
			
			
			int[][] englishScores = new int[2][];
			englishScores[0] = new int[2];        // Scores[0].length= 2 라고 적는건 상수로 풀어내기 때문에 틀리다
			englishScores[1] = new int[3];
			for(int i=0; i<englishScores.length; i++) {
				for(int k=0; k<englishScores[i].length; k++) {
					System.out.println("englishScores[" +i+ "]["+k+"]="+englishScores[i][k]);
				}
			}
			//1층에 두번째 방에 50을 넣어라
			englishScores[0][1] = 50;
			System.out.println(englishScores[0][1]);    //englishScores.length 총 몇층이냐고 물어보는것
	}                                                       //englishScores[0].length 1층이 몇개냐고 물어보는것

}
