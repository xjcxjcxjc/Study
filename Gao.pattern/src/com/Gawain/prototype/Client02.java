package com.Gawain.prototype;

import java.util.Date;

public class Client02 {

	public static void main(String[] args) throws Exception {
		sheep02 s1= new sheep02();
		
		Date date =new Date(13245435432L);
		
		s1.setBirthday(date);
		s1.setName("…Ÿ¿˚");
		
		sheep02 s2 =(sheep02) s1.clone();
		date.setTime(94362832325L);

		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
		
	}
	
	
}
