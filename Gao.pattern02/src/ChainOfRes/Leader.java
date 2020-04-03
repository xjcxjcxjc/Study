package ChainOfRes;

public abstract class Leader {
	
	protected LevRequest request;
	protected String   name;
	protected Leader nextleader;
	
	
	public Leader(String name,LevRequest request) {
		super();
		this.request=request;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNextleader(Leader nextleader) {
		this.nextleader = nextleader;
	}

	protected void check() {;
	
	}
	
}

class Leader1 extends Leader{
	
	
	public Leader1(String name,LevRequest request) {
		super(name, request);
	}
	
	protected void check() {
		
		if(request.getLevDays()<=10) {
			System.out.println("������"+request.getName()+"���������"+request.getLevDays());
			System.out.println("�˲���Ա��"+this.getName());
		}else {
			nextleader.check();
		}
		
		super.check();
	}
	
}

class Leader2 extends Leader{
	
	
	public Leader2(String name,LevRequest request) {
		super(name, request);
	}
	
	protected void check() {
		
		if(request.getLevDays()<=20) {
			System.out.println("������"+request.getName()+"���������"+request.getLevDays());
			System.out.println("�˲���Ա��"+this.getName());
		}else {
			nextleader.check();
		}
		
		super.check();
	}
	
}

class Leader3 extends Leader{
	
	
	public Leader3(String name,LevRequest request) {
		super(name, request);
	}
	
	protected void check() {
		
		if(request.getLevDays()<=30) {
			System.out.println("������"+request.getName()+"���������"+request.getLevDays());
			System.out.println("�˲���Ա��"+this.getName());
		}else {
			nextleader.check();
		}
		
		super.check();
	}
	
}
