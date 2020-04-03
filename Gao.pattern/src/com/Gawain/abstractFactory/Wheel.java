package com.Gawain.abstractFactory;

public interface Wheel {

	Wheel getWheel();
}

class LuxuryWheel implements Wheel {

	public Wheel getWheel() {
		return new LuxuryWheel();
	}
	 
}
class LowWheel implements Wheel {

	public Wheel getWheel() {
		return new LowWheel();
	}
	 
}