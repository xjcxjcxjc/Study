package Strategy;

public class Invoke {
	
	Command com ;

	public Invoke(Command com) {
		super();
		this.com = com;
	}
	
	public void invoke(double money) {
		System.out.println("invoke");
		com.command(money);
		System.out.println("Invoke - Stop");	
	}
	
}
