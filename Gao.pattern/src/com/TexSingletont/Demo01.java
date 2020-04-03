package com.TexSingletont;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Demo01 {

	public static void main (String[] args)  throws Exception {
		
		//通过反射破解单例
		Class<SingletonDemo02> cc=(Class<SingletonDemo02>) Class.forName("com.TexSingletont.SingletonDemo02");
		Constructor<SingletonDemo02> c=cc.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingletonDemo02 s1 =c.newInstance();
		SingletonDemo02 s2 =c.newInstance(null);
		System.out.println(s1);
		System.out.println(s2);
		
		SingletonDemo05 s3 =SingletonDemo05.getinstance();
		
//		Class<SingletonDemo05> cc2=(Class<SingletonDemo05>) Class.forName("com.TexSingletont.SingletonDemo05");
//		Constructor<SingletonDemo05> c2=cc2.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo05 s3 =c2.newInstance();
//		SingletonDemo05 s4=c2.newInstance(null);
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化破解单例
		ObjectOutputStream write =new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
		write.writeObject(s3);
		ObjectInputStream re =new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo05 s4=(SingletonDemo05) re.readObject();
		System.out.println(s3);
		System.out.println(s4);
	}
	
}
