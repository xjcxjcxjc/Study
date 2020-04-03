package Decorator;

/**
 * װ��ģʽ
 * @author Administrator
 *
 */
public interface InterfaceCar {

	void move();
}

class Car implements InterfaceCar{

	public void move() {
		System.out.println("��½������");
	}
	
}

class SuperCar implements InterfaceCar{
	
	private Car c;
	SuperCar b;
	
	public SuperCar(SuperCar b) {
		super();
		this.b= b;
	}
	
	public SuperCar(Car c) {
		super();
		this.c = c;
	}

	public void move() {
		if(b!=null) {
			b.move();
		}

		if(c!=null) {
			c.move();
		}
	}
}

class  FlyCar extends SuperCar{

	
	public void fly() {
		System.out.println("�����Ϸ�");
		
	}
	
	public FlyCar(Car c) {
		super(c);
	}
	
		public void move() {
			super.move();
			fly();
		}
}


class  WaterCar extends SuperCar{

	
	public void water() {
		System.out.println("��ˮ�Ͽ�");
		
	}
	public WaterCar(SuperCar c) {
		super(c);
	}
	
	public WaterCar(Car c) {
		super(c);
	}
	
		public void move() {
			super.move();
			water();
		}
}

class  FighterCar extends SuperCar{

	public FighterCar(SuperCar b) {
		super(b);
	}
	
	public FighterCar(Car c) {
		super(c);
	}
	
	
	
	
	public void fight() {
		System.out.println("���䵼��");
		
	}
	
	
	
		public void move() {
			super.move();
			fight();
		}
}