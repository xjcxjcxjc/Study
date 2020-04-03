package com.Gawain.abstractFactory;

public class luxuryfactory implements Carfactory02{

	public Tyre creatTyre() {
		return new LuxuryTyre().getTyre();
	}

	@Override
	public Engine creatEngine() {
		return new Luxuryengine().getengine();
	}

	@Override
	public Wheel creatWheel() {
		return new LuxuryWheel().getWheel();
	}

	

	
}
