package DynamicProxy;

import java.lang.reflect.Proxy;


/**
 * ¶¯Ì¬´úÀí
 * @author Administrator
 *
 */
public class Client {
	
	public static void main(String[] args) {
		RealStar re =new RealStar();
		StarHander h =new StarHander(re);
		
		Star proxy= (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				re.getClass().getInterfaces(), h);
		
		proxy.sing();
	}
	
}
