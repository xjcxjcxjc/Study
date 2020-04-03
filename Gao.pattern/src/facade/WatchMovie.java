package facade;

public class WatchMovie {

	public void watchmovie() {
		TurnOnApp ta = new TurnOnApp();
		TurnOnMovie tm =new TurnOnMovie();
		Wacth w =new Wacth();
		TakeOffApp woa=new TakeOffApp();
		
		ta.turnOnApp();
		tm.turnOnMovie();
		w.wacth();
		woa.takeoff();
		
	}
}
