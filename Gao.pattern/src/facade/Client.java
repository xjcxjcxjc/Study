package facade;

/**
 * 外观模式
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
//		TurnOnApp ta = new TurnOnApp();
//		TurnOnMovie tm =new TurnOnMovie();
//		Wacth w =new Wacth();
//		TakeOffApp woa=new TakeOffApp();
//		
//		ta.turnOnApp();
//		tm.turnOnMovie();
//		w.wacth();
//		woa.takeoff();
		
		WatchMovie wm =new WatchMovie();
		wm.watchmovie();
		
	}
}
