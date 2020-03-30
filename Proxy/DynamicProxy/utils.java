package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class utils {
	
	Object obj ;
	
	public utils(Object obj) {  //传入一个需要被代理的类
		this.obj=obj;
	}
	
	//得到代理类
	public Object getproxy() {
		Object proxy =Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				obj.getClass().getInterfaces(),
					new InvocationHandler() {
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							System.out.println(method.getName()+"开始使用");
							method.invoke(obj, args);
							return null;
						}
					});
		
		return proxy;
	}
	
	
	
}
