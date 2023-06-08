package sec02.exam06;
//시험 출제 (중첩 interface)
public class Button {
	OnClickListener listener;
	
	
	public void setOnClickListener(OnClickListener listener) {  //생성자를 못만드니까 set을 사용해 우회하여 초기화한다
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
