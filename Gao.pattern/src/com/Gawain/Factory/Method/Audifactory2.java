package com.Gawain.Factory.Method;

public class Audifactory2 implements Carfactory{

	public Car getCar() {
		return new Audi();
	}
                        
}
