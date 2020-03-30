package DynamicProxy;


public class Client03 {

	public static void main(String[] args) {
		
		RealStar s =new RealStar();
		utils u =new utils(s);
		Star proxy=(Star) u.getproxy();
		proxy.sing();
		
	}
}
