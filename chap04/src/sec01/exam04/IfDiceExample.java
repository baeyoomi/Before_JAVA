package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		//주사위공식 Math.random() : 0.23456~5.54456789 소수점까지 캐치하기 때문에 0이 안나오게 하기위해 +1 해준다
		//로또로 예를 들자면 1부터 45까지의 난수(무작위로 추출된 수) : (int)(Math.random()*44)+1;
		int num = (int)(Math.random()*6) + 1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else if(num==6) {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
