package proxy;

/**
 * ���Ծ�̬����
 * @author ��ѳ�
 *
 */
public class Client {

	public static void main(String[] args) {
		RealStar s =new RealStar();
		ProxyStar r= new ProxyStar(s);
		
		r.confer();
		r.contrast();
		r.sing();
		r.collect();
	}
	
	
	
	
}
