package ChainOfRes;


public class Client {

	public static void main(String[] args) {
		
		LevRequest re =new LevRequest("��ѳ�", 25, "�ؼҿ�����");
		
		Leader le1 =new Leader1("��ѳ�le1", re);
		Leader le2 =new Leader2("��ѳ�le2", re);
		Leader le3 =new Leader3("��ѳ�le3", re);
		
		le1.setNextleader(le2);
		le2.setNextleader(le3);
		
		le1.check();
	}
}
