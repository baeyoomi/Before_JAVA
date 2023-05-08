package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}

	}

}
// *별표 찍는 문제 = 중복 for문
// Console에서 옆으로 출력되게 하는 문제 코딩챌린지에 있음 알아봐두기