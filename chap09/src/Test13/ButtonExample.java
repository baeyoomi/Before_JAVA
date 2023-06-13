package Test13;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListner(new MessagaListener());
		btn.touch();

		btn.setOnClickListner(new CallListener());
		btn.touch();
	}

}
