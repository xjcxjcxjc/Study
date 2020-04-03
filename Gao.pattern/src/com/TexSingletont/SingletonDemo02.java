package com.TexSingletont;

/**
 * ����ʽ����ģʽ
 * @author xjc
 *
 */
public class SingletonDemo02 {

	//����ʱ����
	private static SingletonDemo02 s ;
	
	private SingletonDemo02() {
	}

	//����Ч�ʲ���
	public synchronized static SingletonDemo02 getinstance() {
		if(s==null) {
			s=new SingletonDemo02();
		}
		return s;		
	}
}