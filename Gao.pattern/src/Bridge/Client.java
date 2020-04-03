package Bridge;

/**
 * 桥接模式
 * @author 项佳诚
 *
 */
public class Client {

	public static void main(String[] args) {
		LX brand =new LX(); 
		lapcom com =new lapcom(brand);
		System.out.println(brand);
		com.sale();
		
	}
}
