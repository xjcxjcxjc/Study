package mediator;


public interface Department {
	
	void Selfmove();
	void Outmove();
}


class Develop implements Department{
	
	private mediator m;
	
	public Develop(mediator m) {
		super();
		this.m = m;
		m.register("研发部门", this);
	}

	public void Selfmove() {
		System.out.println("在搞研发");
	}

	public void Outmove() {
		System.out.println("研发部门汇报工作：没钱研发了");
		m.commandSelfwork("财务部门");
	}
	
}

class finance implements Department{
	
	private mediator m;
	
	public finance(mediator m) {
		super();
		this.m = m;
		m.register("财务部门", this);
	}

	public void Selfmove() {
		System.out.println("财务部门：在数钱,马上发钱");
	}

	public void Outmove() {
		System.out.println("汇报工作：这个月赚了多少多少钱 ");
	}
	
}


class Market implements Department{
	
	private mediator m;
	
	public Market(mediator m) {
		super();
		this.m = m;
		m.register("市场部门", this);
	}

	public void Selfmove() {
		System.out.println("调研市场");
	}

	public void Outmove() {
		System.out.println("汇报工作：哪哪有钱赚");
	}
	
}