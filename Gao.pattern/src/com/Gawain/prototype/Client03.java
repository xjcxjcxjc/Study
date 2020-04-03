package com.Gawain.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 使用序列化反序列化 克隆对象
 * @author 项佳诚
 *
 */


public class Client03 {

	public static void main(String[] args) throws Exception {
		sheep s1= new sheep();
		
		Date date =new Date(13245435432L);
		s1.setBirthday(date);
		s1.setName("少利");
		System.out.println("s1原日期"+s1.getBirthday());
		
		ByteArrayOutputStream bao =new ByteArrayOutputStream();
		ObjectOutputStream oos =new ObjectOutputStream(bao);
		oos.writeObject(s1);
		byte[] by=bao.toByteArray();
		ObjectInputStream in =new ObjectInputStream(new ByteArrayInputStream(by));
		sheep s2=(sheep)in.readObject();
		
		
		date.setTime(94362832325L);
		
		System.out.println("s1现日期"+s1.getBirthday());
		
		System.out.println("s2现日期"+s2.getBirthday());
		
	}
	
	
}
