package com.Gawain.abstractFactory;

public interface Engine {

	Engine getengine();
	void run();
}


class Luxuryengine implements Engine {
	
	
	public  void run() {
		System.out.println("ת�ÿ�");
	}
	
	public Engine getengine() {
		return new Luxuryengine();
	}
	 
}

class Lowengine implements Engine {

	public void run() {
		System.out.println("ת����");
	}
	
	public Engine getengine() {
		return new Lowengine();
	}
	 
}