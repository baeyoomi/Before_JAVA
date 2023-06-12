package test11;

public class ButtonEaxmple {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessagaListener());
		btn.touch();
	}
}
