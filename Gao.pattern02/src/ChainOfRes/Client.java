package ChainOfRes;


public class Client {

	public static void main(String[] args) {
		
		LevRequest re =new LevRequest("项佳诚", 25, "回家看妈妈");
		
		Leader le1 =new Leader1("项佳诚le1", re);
		Leader le2 =new Leader2("项佳诚le2", re);
		Leader le3 =new Leader3("项佳诚le3", re);
		
		le1.setNextleader(le2);
		le2.setNextleader(le3);
		
		le1.check();
	}
}
