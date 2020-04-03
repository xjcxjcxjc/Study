package com.Gawain.prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws Exception {
		sheep s1= new sheep();
		
		Date date =new Date(13245435432L);
		s1.setBirthday(date);
		s1.setName("…Ÿ¿˚");
		
		sheep s2 =(sheep) s1.clone();
		date.setTime(94362832325L);
		
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
		
	}
	
	
}
