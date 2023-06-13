package sec03.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("개가 짖습니다.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		//매개값으로 대입
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("고양이가 웁니다.");
				
			}
		});
	}
}
