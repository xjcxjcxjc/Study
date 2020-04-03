package Strategy;

public interface Cases {
	
	double Move(double money);
	
}

class Case1 implements Cases{
	public double Move(double money) {
		System.out.println("case1£º9ÕÛ");
		return money*0.9;
	}
}

class Case3 implements Cases{
	public double Move(double money) {
		System.out.println("case3£º7ÕÛ");
		return money*0.97;
	}
}

class Case2 implements Cases{
	public double Move(double money) {
		System.out.println("case2£º8ÕÛ ×Ü¹²£º"+money*0.8);
		return money*0.8;
	}
}
