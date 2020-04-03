package com.TexSingletont;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例模式
 * @author xjc
 *
 */
public class SingletonDemo05 implements Serializable{

	//有延时优势
	private static SingletonDemo05 s ;
	
	//防止反射调用
	private SingletonDemo05() {
		if(s !=null) {
			throw new RuntimeException();
		}
	}

	//调用效率不高
	public synchronized static SingletonDemo05 getinstance() {
		if(s==null) {
			s=new SingletonDemo05();
		}
		return s;		
	}
	
	//在反序列化的时候返回对象，不需要再返回新对象
	private Object readResolve() throws ObjectStreamException{
		return s;
	}
	
}