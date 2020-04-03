package com.TexSingletont;

/**
 * ��̬�ڲ��൥��ģʽ:��ʱ���أ��̰߳�ȫ
 * @author xjc
 *
 */
public class SingletonDemo03 {
	
	private static class SingletonDemo03Instance{
		private static SingletonDemo03 Instance=new SingletonDemo03();
	}

	private SingletonDemo03() {
	}

	public synchronized static SingletonDemo03 getinstance() {
		return SingletonDemo03Instance.Instance ;		
	}
}