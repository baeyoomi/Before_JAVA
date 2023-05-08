package sec02.exam06;
 // 시험문제
public class Test2 {
          //while로 작성한것 for문으로 바꾸기
	public static void main(String[] args) {
		int total = 0;
		for (int i=1; i<=10; i++)  {//(초기값; 최종값; 증가값;)
			total += i;
			System.out.print(i);
			if(i!=10) {  
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}

//println은 ()뒤로 인식하기 때문에 밑에 라인으로 안간다