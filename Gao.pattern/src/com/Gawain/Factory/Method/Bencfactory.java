package com.Gawain.Factory.Method;

public class Bencfactory implements Carfactory{

	public  Car getCar() {
		return new Benc();
	}
                        
}
