package com.TexSingletont;

/**
 * 静态内部类单例模式:延时加载，线程安全
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