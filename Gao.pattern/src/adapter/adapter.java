package adapter;

/**
 * ÊÊÅä¶ÔÏó
 * @author Administrator
 *
 */
public class adapter implements Target{

	adaptee ee ;
	public adapter(adaptee ee ) {
		this.ee =ee;
	}
	
	public void handrequest() {
		ee.request();
		return ;
	}
}
