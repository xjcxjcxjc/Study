package com.Gwain.developer;

public class xjcShipBuider implements ShipBuider{

	private orbitalmodule module;
	private shipEngine engine;
	private escapeTower tower;
	
	public orbitalmodule creatmodule() {
		System.out.println("���������");
		return new orbitalmodule();
	}

	public shipEngine createngine() {
		System.out.println("����������");
		return new shipEngine();
	}

	public escapeTower creattower() {
		System.out.println("����������");
		return new escapeTower();
	}

}
