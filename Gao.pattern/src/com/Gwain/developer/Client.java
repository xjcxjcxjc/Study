package com.Gwain.developer;

/**
 * 构造者模式，用于构造复杂对象
 * @author 项佳诚
 *
 */

public class Client {

	public static void main(String[] args) {
		Airship ship =new Airship(null);
		xjcShipBuider bu =new xjcShipBuider();
		ShipDirector du =new ShipDirector(ship, bu);
		du.director();
		
		ship.call();
	}
}
