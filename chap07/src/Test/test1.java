package Test;

public class test1 {

	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	static ShopService getInstance() {
		return singleton;
	}
		

	

}
