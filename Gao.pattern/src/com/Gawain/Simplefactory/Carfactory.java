package com.Gawain.Simplefactory;


public class Carfactory {
	
	public static Car getcat(String name) {

		if(name.equals("°ÂµÏ")) {
			return new Audi();
		}else if(name.equals("±¼³Û")){
			return new Benc();
		}else {
			return null;
		}
		
	}

}
