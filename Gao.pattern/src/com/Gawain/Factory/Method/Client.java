package com.Gawain.Factory.Method;


/**
 * ��������ģʽ���������
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Car c1 =new Bencfactory().getCar();
		Car c2 =new Audifactory2().getCar();
		Car c3 =new Audifactory2().getCar();
		
		System.out.println(c1);
		System.out.println(c2);
		c1.run();
		c2.run();
	}
}
