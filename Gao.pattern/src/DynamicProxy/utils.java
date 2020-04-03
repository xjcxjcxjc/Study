package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class utils {
	
	Object obj ;
	
	public utils(Object obj) {  //����һ��������
		this.obj=obj;
	}
	
	public Object getproxy() {
		Object proxy =Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				obj.getClass().getInterfaces(),
					new InvocationHandler() {
			
						//ÿ�ε��÷����ͻ����invoke
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							System.out.println(method.getName()+"��ʼʹ��");
							method.invoke(obj, args);
							return null;
						}
					});
		
		return proxy;
	}
	
	
	
}
