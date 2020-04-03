package Bridge;

public class Computer {
	
	protected  Brand brand;
	
	
	public Computer(Brand brand){
		this.brand=brand;
		System.out.println(brand);
	}
	
	public  void sale() {
		System.out.println();
		brand.sale();
	}
}


class lapcom extends Computer{
	
	public lapcom(Brand brand) {
		super(brand);
	}

	public  void sale() {
		System.out.println("����̨ʽ����");
		brand.sale();
	}
	
}

class deskcom extends Computer{
	
	public deskcom(Brand brand) {
		super(brand);
	}


	public  void sale() {
		System.out.println("����ƽ�����");
		brand.sale();
	}
	
}

class pidcom extends Computer{
	
	public pidcom(Brand brand) {
		super(brand);
	}

	public  void sale() {
		System.out.println("���۱ʼǱ�����");
		brand.sale();
	}
	
}