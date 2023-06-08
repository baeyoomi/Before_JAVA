package sec02.exam07;

public class Button {
	OnClickButtonListener listener;
	

	static interface OnClickButtonListener {
		void onClick();
	}
	
	public void setOnClickButtonListener(OnClickButtonListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}


}
