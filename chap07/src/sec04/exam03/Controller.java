package sec04.exam03;

public class Controller {
	public MemberService service;
	// var MemberService service = new____()
	public void setService (MemberService service) {
		this.service = service;
	}
}

Controller controller = new Controller();
Controller.setSevice(__________________);

1) new Service()         // (X) 부모니까 자동형변환을 해야한다.
2) new MemberService()   // (o) 본인 객체 생성인데 안될리가~
3) new AService()        // (o) 자식이니까 자동형변환이 된다
4) new BService()        // (o) 자식이니까 자동형변환이 된다
5) new BoardService()    // (X) 사촌이라 생성할 수 없음
6) new DService()        // (X) 사촌 조카라 생성할 수 없음
