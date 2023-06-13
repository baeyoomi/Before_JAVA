package Test12;

public class Button {
	OnClickListener listner;
	

	public void setOnClickLisner(OnClickListener listner) {
		this.listner = listner;
	}

	void touch() {
		listner.onClick();
	}

	static interface OnClickListener {
		void onClick();
	}
}
