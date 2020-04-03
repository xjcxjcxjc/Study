package adapter;

/**
 * ÊÊÅäÆ÷2
 * @author Administrator
 *
 */
public class adapter02 implements Target{
	
	adaptee02 e ;
	String name;
	
	public adapter02(adaptee02 e,String name) {
		this.e =e;
		this.name = name;
	}
	
	public void handrequest() {
		e.request(name);
	}

	
	
}
