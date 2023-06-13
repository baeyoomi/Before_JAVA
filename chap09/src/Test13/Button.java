package Test13;

public class Button {
	OnClickListener listner;
	
	public void setOnClickListner(OnClickListener listner) {
		this.listner = listner;
	}

	void touch() {
		listner.onClick();
	}

	static interface OnClickListener{
		void onClick();
	}
}
