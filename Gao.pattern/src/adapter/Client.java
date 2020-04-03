package adapter;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

/**
 * 适配器模式,对象都通过Target实现
 * @author Administrator
 *
 */
public class Client {
	
	public static void test(Target t) {
		t.handrequest();
	}
	

	public static void main(String[] args) {
		adaptee ee =new adaptee();
		Target t =new adapter(ee);
		test(t);
		
		adaptee02 e2 =new adaptee02();
		String name ="项佳诚";
		test(new adapter02(e2,name));

		//使用适配器模式，把字符串输入bytearrayinputstream ，再打印成字符串
		System.out.println("################");
		Text t2 =Text.GetInstance();
		String s ="我是项佳诚";		
		byte[] by= s.getBytes();
		adapter03 a3=new adapter03(t2, by);
		test(a3);
		
	}
}
