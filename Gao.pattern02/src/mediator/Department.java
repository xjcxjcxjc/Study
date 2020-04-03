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
		m.register("�з�����", this);
	}

	public void Selfmove() {
		System.out.println("�ڸ��з�");
	}

	public void Outmove() {
		System.out.println("�з����Ż㱨������ûǮ�з���");
		m.commandSelfwork("������");
	}
	
}

class finance implements Department{
	
	private mediator m;
	
	public finance(mediator m) {
		super();
		this.m = m;
		m.register("������", this);
	}

	public void Selfmove() {
		System.out.println("�����ţ�����Ǯ,���Ϸ�Ǯ");
	}

	public void Outmove() {
		System.out.println("�㱨�����������׬�˶��ٶ���Ǯ ");
	}
	
}


class Market implements Department{
	
	private mediator m;
	
	public Market(mediator m) {
		super();
		this.m = m;
		m.register("�г�����", this);
	}

	public void Selfmove() {
		System.out.println("�����г�");
	}

	public void Outmove() {
		System.out.println("�㱨������������Ǯ׬");
	}
	
}