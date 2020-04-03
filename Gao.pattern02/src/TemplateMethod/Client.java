package TemplateMethod;

public class Client {

	public static void main(String[] args) {
		
		new BankTemplateMethod() {
			public void Transact() {
				System.out.println("举起手来，抢劫，把钱都装袋子里");
			}
		}.process();
		
	}
}
