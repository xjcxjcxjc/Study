package com.Gawain.abstractFactory;

public interface Engine {

	Engine getengine();
	void run();
}


class Luxuryengine implements Engine {
	
	
	public  void run() {
		System.out.println("转得快");
	}
	
	public Engine getengine() {
		return new Luxuryengine();
	}
	 
}

class Lowengine implements Engine {

	public void run() {
		System.out.println("转得慢");
	}
	
	public Engine getengine() {
		return new Lowengine();
	}
	 
}