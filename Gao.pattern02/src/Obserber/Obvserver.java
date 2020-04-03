package Obserber;

public interface Obvserver {
	
	void update(int State);
}

class ConcreteObs implements Obvserver{

	private int State;
	public void update(int State) {
		this.State=State;
		System.out.println(State);
	}
}
