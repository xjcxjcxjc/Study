package State;

/**
 * ״̬ģʽ
 * @author ��ѳ�
 *
 */
public class Clent {

	public static void main(String[] args) {
		
		State s1 =new FreeState();
		State s2 =new BusyState();
		State s3 =new CleanState();
		
		Context con =new Context();
		con.SetState(s1);
		con.SetState(s2);
		
	}
}
