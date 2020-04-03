package TemplateMethod;


public abstract class BankTemplateMethod {
	
	public void TakeNumber() {
		System.out.println("≈≈∂”»°∫≈");
	}
	public abstract void Transact();
	
	public void evaluate() {
		System.out.println("∆¿π¿");
	}
	
	public void  process() {
		TakeNumber();
		Transact();
		evaluate();
	}
	
}




