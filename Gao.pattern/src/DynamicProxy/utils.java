package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class utils {
	
	Object obj ;
	
	public utils(Object obj) {  //传入一个代理类
		this.obj=obj;
	}
	
	public Object getproxy() {
		Object proxy =Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				obj.getClass().getInterfaces(),
					new InvocationHandler() {
			
						//每次调用方法就会调用invoke
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							System.out.println(method.getName()+"开始使用");
							method.invoke(obj, args);
							return null;
						}
					});
		
		return proxy;
	}
	
	
	
}
