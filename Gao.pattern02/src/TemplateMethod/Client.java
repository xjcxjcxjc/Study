package TemplateMethod;

public class Client {

	public static void main(String[] args) {
		
		new BankTemplateMethod() {
			public void Transact() {
				System.out.println("�������������٣���Ǯ��װ������");
			}
		}.process();
		
	}
}
