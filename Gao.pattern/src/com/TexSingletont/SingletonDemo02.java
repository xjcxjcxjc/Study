package com.TexSingletont;

/**
 * 懒汉式单例模式
 * @author xjc
 *
 */
public class SingletonDemo02 {

	//有延时优势
	private static SingletonDemo02 s ;
	
	private SingletonDemo02() {
	}

	//调用效率不高
	public synchronized static SingletonDemo02 getinstance() {
		if(s==null) {
			s=new SingletonDemo02();
		}
		return s;		
	}
}