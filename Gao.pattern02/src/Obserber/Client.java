package Obserber;


/**
 * 观察者模式,改变主体的值，观察者类也改变
 * @author 项佳诚
 *
 */
public class Client {

	public static void main(String[] args) {
		Subject sub =new ConcreteSubj();
		
		Obvserver ser1 =new ConcreteObs();
		Obvserver ser2 =new ConcreteObs();
		Obvserver ser3 =new ConcreteObs();

		sub.addObs(ser1);
		sub.addObs(ser2);
		sub.addObs(ser3);
		
		sub.setState(4);
		
		
	}
}
