package ChainOfRes;

/**
 * ������ģʽ��һ����һ����Ҳ���԰����ζ���Ž�����򼯺�
 * @author ��ѳ�
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
