package com.Gwain.developer;

public class xjcShipBuider implements ShipBuider{

	private orbitalmodule module;
	private shipEngine engine;
	private escapeTower tower;
	
	public orbitalmodule creatmodule() {
		System.out.println("构建轨道舱");
		return new orbitalmodule();
	}

	public shipEngine createngine() {
		System.out.println("构建发动机");
		return new shipEngine();
	}

	public escapeTower creattower() {
		System.out.println("构建逃生舱");
		return new escapeTower();
	}

}
