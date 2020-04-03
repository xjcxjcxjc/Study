package com.Gwain.developer;


public class ShipDirector implements Director{

	Airship ship;
	xjcShipBuider bu =new xjcShipBuider();

	public ShipDirector(Airship ship,xjcShipBuider bu) {
		this.bu=bu;
		this.ship =ship;
	}
	
	
	public void director() {
		ship.setModule(bu.creatmodule());
		ship.setEngine(bu.createngine());
		ship.setTower(bu.creattower());
	}
	
	
	
	
}
