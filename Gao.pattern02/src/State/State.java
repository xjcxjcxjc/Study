package State;

public interface State {
	
	String GetName();
	void handle();
}


class FreeState implements State  {
	
	String name="����";

	public void handle() {
		System.out.println("�������");
	}

	@Override
	public String GetName() {
		return name;
	}
}

class BusyState implements State  {

	String name="����";
	public void handle() {
		System.out.println("������ס");
	}
	
	public String GetName() {
		return name;
	}
}

class CleanState implements State  {

	String name="��ɨ";
	public void handle() {
		System.out.println("�����ɨ");
	}
	
	public String GetName() {
		return name;
	}
}

