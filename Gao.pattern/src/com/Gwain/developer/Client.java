package com.Gwain.developer;

/**
 * ������ģʽ�����ڹ��츴�Ӷ���
 * @author ��ѳ�
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
