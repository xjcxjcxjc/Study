package com.TexSingletont;

/**
 * ����ʽ����ģʽ
 * @author xjc
 *
 */
public class SingletonDemo01 {

	//���ʼ��ʱֱ�Ӽ����ࣨû����ʱ���ص����ƣ����߳���Ȼ��ȫ
	private  static SingletonDemo01 s =new SingletonDemo01();
	
	private SingletonDemo01() {
	}

	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo01 getinstance() {
		return s;		
	}
}
