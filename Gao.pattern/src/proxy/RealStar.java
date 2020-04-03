package proxy;


public class RealStar implements Star{

	
	public RealStar() {
		
	}
	
	public String toString() {
		return "RealStar";
	}
	
	public  void confer() {
		System.out.println(this.toString());
	}

	public void contrast() {
		System.out.println(this.toString());
	}

	@Override
	public void sing() {
		System.out.println(this.toString());
		
	}

	@Override
	public void collect() {
		System.out.println(this.toString());
		
	}

}
