package adapter;


public class Client02 {

	public static void main(String[] args) throws Exception, Exception {
		Text t =Text.GetInstance();
		String s ="������ѳϣ��������㽭����ϲ������rap����";		
		byte[] by= s.getBytes();
		
		
		System.out.println(t.read(by));
	}
}
