package Obserber;


/**
 * �۲���ģʽ,�ı������ֵ���۲�����Ҳ�ı�
 * @author ��ѳ�
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
