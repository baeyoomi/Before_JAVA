package sec02.exam07;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickButtonListener(new CallListener());
		btn.touch();
		
		btn.setOnClickButtonListener(new MessageListener());
		btn.touch();

	}

}
