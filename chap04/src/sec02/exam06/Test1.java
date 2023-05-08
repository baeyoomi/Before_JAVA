package sec02.exam06;
  //시험문제
public class Test1 {
							// 집에서 꼭 해보기!!!!!!
	public static void main(String[] args) {
		int total = 0;
		int i = 0;
		while (i<10) { // i = 0   ......... i = 9
			i++;       // i = 0 (1)  ......... i = 9 (10)
			total+=i;  // tot(1)=tot(0) + 1 .... tot(55) = tot(45) + 10
			System.out.print(i); //1 + ...........9 + 10
			if(i!=10) {    //10 나올때까지 돌아가랏
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}
