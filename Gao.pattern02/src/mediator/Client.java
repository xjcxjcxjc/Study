package mediator;

/**
 * 
 * 中介模式
 * @author 项佳诚
 *
 */
public class Client {

	public static void main(String[] args) {
		mediator m =new ConcreteMediator();
		Develop d =new Develop(m);
		finance f =new finance(m);
		Market mrket =new Market(m);
		
		m.commandOutWork("研发部门");
		
	}
}
