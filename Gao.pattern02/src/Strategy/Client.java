package Strategy;

/**
 * ����ģʽ
 * @author ��ѳ�
 *
 */
public class Client {

	public static void main(String[] args) {
		Command com =new Command(new Case2());
		Invoke in =new Invoke(com);
		 in.invoke(999.999);
		
	}
}
