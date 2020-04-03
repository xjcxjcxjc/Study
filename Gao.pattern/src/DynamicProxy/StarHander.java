package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHander implements InvocationHandler{
	
	RealStar re ;
	public StarHander(RealStar e) {
		this.re =e ;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("sssss");
		if(method.getName().equals("sing")) {
			method.invoke(re, args);
		}
		return re.toString();
	}

}
