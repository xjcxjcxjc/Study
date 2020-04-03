package com.Gawain.Simplefactory;


public class Carfactory02 {
	
	public static Car GetAudi() {
		return new Audi();
	}

	public static Car GetBenc() {
		return new Benc();
	}
}
