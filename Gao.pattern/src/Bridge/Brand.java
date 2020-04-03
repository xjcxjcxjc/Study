package Bridge;

/**
 * 电脑品牌
 * @author 项佳诚
 *
 */
public interface Brand {

	void sale();
}

class sz implements Brand{
	
	public void sale() {
		System.out.println("销售神州电脑");
	}
	
}

class Dl implements Brand{
	
	public void sale() {
		System.out.println("销售戴尔电脑");
	}
	
}
class LX implements Brand{
	
	public void sale() {
		System.out.println("销售联想电脑");
	}
	
}
