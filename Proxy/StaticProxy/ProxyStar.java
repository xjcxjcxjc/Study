package proxy;

/**
 * ´úÀí
 * @author Administrator
 *
 */
public class ProxyStar implements Star {

	RealStar r =new RealStar();
	
	public ProxyStar(RealStar r) {
		this.r=r;
	}
	
		public String toString() {
			return "ProxyStar";
		}
	
	public void confer() {
		System.out.println(this.toString());
	}

	@Override
	public void contrast() {
		System.out.println(this.toString());
		
	}

	@Override
	public void sing() {
		r.sing();
	}

	@Override
	public void collect() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

	
}
