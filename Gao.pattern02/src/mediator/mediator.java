package mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * ÖÐ½é
 * @author Administrator
 *
 */
public interface mediator {
	
	void register(String name,Department d);
	void command(String com);
	void commandOutWork(String com);
	void commandSelfwork(String com);
}

class ConcreteMediator implements mediator{

	private Map<String , Department> map =new HashMap<String, Department>();
	
	public void register(String name,Department d) {
		map.put(name, d);
	}

	public void commandSelfwork(String com) {
		map.get(com).Selfmove();
	}

	public void commandOutWork(String com) {
		map.get(com).Outmove();
	}

	public void command(String com) {
	}
	
}

