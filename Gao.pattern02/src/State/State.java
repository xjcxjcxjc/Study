package State;

public interface State {
	
	String GetName();
	void handle();
}


class FreeState implements State  {
	
	String name="空闲";

	public void handle() {
		System.out.println("房间空闲");
	}

	@Override
	public String GetName() {
		return name;
	}
}

class BusyState implements State  {

	String name="有人";
	public void handle() {
		System.out.println("房间入住");
	}
	
	public String GetName() {
		return name;
	}
}

class CleanState implements State  {

	String name="打扫";
	public void handle() {
		System.out.println("房间打扫");
	}
	
	public String GetName() {
		return name;
	}
}

