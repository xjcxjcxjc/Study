package adapter;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

/**
 * ������ģʽ,����ͨ��Targetʵ��
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
		String name ="��ѳ�";
		test(new adapter02(e2,name));

		//ʹ��������ģʽ�����ַ�������bytearrayinputstream ���ٴ�ӡ���ַ���
		System.out.println("################");
		Text t2 =Text.GetInstance();
		String s ="������ѳ�";		
		byte[] by= s.getBytes();
		adapter03 a3=new adapter03(t2, by);
		test(a3);
		
	}
}
