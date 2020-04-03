package Decorator;


/**
 * 装饰模式
 * @author 项佳诚
 *
 */
public class Client {

	public static void main(String[] args) {
		Car c =new Car();
		//c.move();
		//FighterCar fc =new FighterCar(c);
		
		WaterCar wac =new WaterCar(new FlyCar(c));
		FighterCar fc2 =new FighterCar(wac);
		fc2.move();
	}
}
