package sec02.exam06;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1; //초기화 상태가 1인건 while에서 재활용하기때문
		while (i<=10) {
			System.out.println(i);
			i++;
		}

	}

}
