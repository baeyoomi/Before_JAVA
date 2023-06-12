package test09;

public class MessageListener implements Button.OnClickListener {
	//중첩인터페이스라서 경로표시를 해야함 (Button.OnClickListener)
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
		
	}

}
