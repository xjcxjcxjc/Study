package Observer2;

import java.util.Observable;
import java.util.Observer;

public class ConcreteSubject implements Observer {
	protected  int State;

	public void update(Observable o, Object arg) {
		
	}
	
	

	public ConcreteSubject() {
		super();
	}

	public int getState() {
		return State;
	}

	public void setState(int state) {
		State = state;
		
		
	}
	
	
	
	
	
}
