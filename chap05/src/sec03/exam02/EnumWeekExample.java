package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {
//index개념에 java 실행클래스 (Example = 메인함수) 패키지별로 메인함수는 한개만 등록할수 있다 
	public static void main(String[] args) {
		Week today = null;     //today 변수명 , null로 초기화
		
		Calendar cal = Calendar.getInstance();       //오늘의 연월일식시분초까지의 정보가 cal에 들어감
		int week = cal.get(Calendar.DAY_OF_WEEK);    // 그중에 요일을 쓸거임 int로 week에 저장
		//week=week+2; 이걸로 다른날짜로 바꿔볼수 있다
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;         // Week.SUNDAY;  Week의 하위항목 SUNDAY
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: " + today);     //week찍으면 오늘 목요일이라 5가 나옴

		if(today == Week.SUNDAY) {
			System.out.println("코끼리 일광욕 하는 날");
		} else if (today == Week.MONDAY) {
			System.out.println("원숭이 일광욕 하는 날");
		} else if (today == Week.TUESDAY) {
			System.out.println("기린 일광욕 하는 날");
		} else if (today == Week.WEDNESDAY) {
			System.out.println("토끼 일광욕 하는 날");
		} else if (today == Week.THURSDAY) {
			System.out.println("하마 일광욕 하는 날");
		} else if (today == Week.FRIDAY) {
			System.out.println("북극곰 일광욕 하는 날");
		} else {
			System.out.println("코뿔소 일광욕 하는 날");
		}
	}

}
