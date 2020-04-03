package Obserber;

import java.util.ArrayList;
import java.util.List;

/**
 * Ö÷Ìå
 * @author Ïî¼Ñ³Ï
 *
 */
public class Subject {
	
	protected  int State;
	protected Obvserver obs;
	List<Obvserver> list =new ArrayList<Obvserver>();
	
	public Subject() {
		super();
	}

	public void addObs(Obvserver obs) {
		list.add(obs);
	}
	
	public int getState() {
		return State;
	}

	public void setState(int state) {
		State = state;
	}
}

class ConcreteSubj extends Subject {
	
	public void setState(int state) {
		for (Obvserver obs : list) {
			obs.update(state);
		}
		super.setState(state);
	}
	
}

