package adapter;


public class Client02 {

	public static void main(String[] args) throws Exception, Exception {
		Text t =Text.GetInstance();
		String s ="我是项佳诚，我来自浙江，我喜欢唱跳rap篮球";		
		byte[] by= s.getBytes();
		
		
		System.out.println(t.read(by));
	}
}
