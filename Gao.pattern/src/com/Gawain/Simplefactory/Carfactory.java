package com.Gawain.Simplefactory;


public class Carfactory {
	
	public static Car getcat(String name) {

		if(name.equals("�µ�")) {
			return new Audi();
		}else if(name.equals("����")){
			return new Benc();
		}else {
			return null;
		}
		
	}

}
