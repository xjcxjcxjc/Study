package ChainOfRes;

/**
 * 责任链模式，一条接一条，也可以把责任对象放进数组或集合
 * @author 项佳诚
 *
 */

public class LevRequest {
	private String name;
	private int levDays;
	private String LevReason;
	public LevRequest(String name, int levDays, String levReason) {
		super();
		this.name = name;
		this.levDays = levDays;
		LevReason = levReason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevDays() {
		return levDays;
	}
	public void setLevDays(int levDays) {
		this.levDays = levDays;
	}
	public String getLevReason() {
		return LevReason;
	}
	public void setLevReason(String levReason) {
		LevReason = levReason;
	}
	
	
	
	
}
