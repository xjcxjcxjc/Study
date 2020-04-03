package Strategy;

public class Command {
	
	private Cases c;
	
	public Command(Cases c) {
		this.c= c;
	}
	
	public void command(double money) {
		System.out.println("Command");
		c.Move(money);
		System.out.println("Command - Stop");
	}
	
}
