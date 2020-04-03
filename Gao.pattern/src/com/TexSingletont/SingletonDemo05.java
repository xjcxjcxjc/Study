package com.TexSingletont;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ����ʽ����ģʽ
 * @author xjc
 *
 */
public class SingletonDemo05 implements Serializable{

	//����ʱ����
	private static SingletonDemo05 s ;
	
	//��ֹ�������
	private SingletonDemo05() {
		if(s !=null) {
			throw new RuntimeException();
		}
	}

	//����Ч�ʲ���
	public synchronized static SingletonDemo05 getinstance() {
		if(s==null) {
			s=new SingletonDemo05();
		}
		return s;		
	}
	
	//�ڷ����л���ʱ�򷵻ض��󣬲���Ҫ�ٷ����¶���
	private Object readResolve() throws ObjectStreamException{
		return s;
	}
	
}