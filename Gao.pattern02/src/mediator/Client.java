package mediator;

/**
 * 
 * �н�ģʽ
 * @author ��ѳ�
 *
 */
public class Client {

	public static void main(String[] args) {
		mediator m =new ConcreteMediator();
		Develop d =new Develop(m);
		finance f =new finance(m);
		Market mrket =new Market(m);
		
		m.commandOutWork("�з�����");
		
	}
}
