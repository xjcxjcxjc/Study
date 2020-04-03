package com.TexSingletont;

/**
 * 使用枚举式实现单例
 * 
 * 避免反射，反序列化的一些漏洞
 * @author xjc
 *
 */
public enum SingletonDemo04 {
	
	//这个枚举元素，本身就是单列对象
	INSTANCE;
	
	
	//添加自己需要的操作
	public void method() {
		
	}
}