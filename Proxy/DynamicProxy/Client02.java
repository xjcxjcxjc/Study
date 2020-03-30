package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client02 {

	public static void main(String[] args) {
		
		RealStar s =new RealStar();
		Star pro=(Star) getproxy(s);
		pro.sing();
		
	}
	
	
	
	private static Object getproxy(Object obj) {
		Object proxy =Proxy.newProxyInstance(obj.getClass().getClassLoader(), 
				obj.getClass().getInterfaces(),
					new InvocationHandler() {
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
									System.out.println("方法开始执行");
									method.invoke(obj, args);
									
									return null;
								}
							});
		
		return proxy;
	}
}
