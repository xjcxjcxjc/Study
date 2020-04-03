package com.Gawain.abstractFactory;

public interface Tyre {

	Tyre getTyre();
}

class LuxuryTyre implements Tyre {

	public Tyre getTyre() {
		return new LuxuryTyre();
	}
	 
}
class LowTyre implements Tyre {

	public Tyre getTyre() {
		return new LowTyre();
	}
	 
}