package Strategy;

/**
 * 策略模式
 * @author 项佳诚
 *
 */
public class Client {

	public static void main(String[] args) {
		Command com =new Command(new Case2());
		Invoke in =new Invoke(com);
		 in.invoke(999.999);
		
	}
}
