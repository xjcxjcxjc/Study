package TemplateMethod;


public abstract class BankTemplateMethod {
	
	public void TakeNumber() {
		System.out.println("�Ŷ�ȡ��");
	}
	public abstract void Transact();
	
	public void evaluate() {
		System.out.println("����");
	}
	
	public void  process() {
		TakeNumber();
		Transact();
		evaluate();
	}
	
}




