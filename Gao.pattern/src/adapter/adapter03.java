package adapter;

public class adapter03 implements Target{

	Text t;
	byte[] by;
	public adapter03(Text t,byte[] by) {
		this.t=t;
		this.by=by;
		
	}
	
	public void  handrequest() {
		String s=t.read(by);
		System.out.println(s);
	}

	
}
