package sec04.exam04;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		// (x) controller.setService(new Service());
		// (x) controller.service.login();
		controller.setService(new MemberService());
		controller.service.login();
		controller.setService(new AService());
		controller.service.login();      //전달하는게 무엇인가에 따라 실행했을때 내용이 달라짐
		
	}

}
