package State;


public class Context {
	private State state;
	
	public Context() {
		System.out.println("房间创建");
	}
	
	public void SetState(State s){
		this.state=s;
		s.handle();
	}
	
	public String  getState() {
		return state.GetName();
	}
	
}
