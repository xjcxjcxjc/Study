package Bridge;

/**
 * �Ž�ģʽ
 * @author ��ѳ�
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
