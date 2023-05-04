package sec01_exam03;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
		//int v3 = v1 + v2;
		//v2를 int로 달아 v2 = v1 - 10 수식에 사용하여 답을 구함 그 다음 수식으로 사용 할수없음 (수식에 의한 닶)
		//"sysout" + ctrl + space = System.out.println();
		//int 변수형
	}

}
