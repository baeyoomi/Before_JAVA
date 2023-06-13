package Test12;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickLisner(new MessagaListener());
		btn.touch();
		
		btn.setOnClickLisner(new CallListener());
		btn.touch();

	}

}
