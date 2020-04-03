package com.TexSingletont;

/**
 * 饿汉式单例模式
 * @author xjc
 *
 */
public class SingletonDemo01 {

	//类初始化时直接加载类（没有延时加载的优势），线程天然安全
	private  static SingletonDemo01 s =new SingletonDemo01();
	
	private SingletonDemo01() {
	}

	//方法没有同步，调用效率高
	public static SingletonDemo01 getinstance() {
		return s;		
	}
}
