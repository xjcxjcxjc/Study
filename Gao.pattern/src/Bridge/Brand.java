package Bridge;

/**
 * ����Ʒ��
 * @author ��ѳ�
 *
 */
public interface Brand {

	void sale();
}

class sz implements Brand{
	
	public void sale() {
		System.out.println("�������ݵ���");
	}
	
}

class Dl implements Brand{
	
	public void sale() {
		System.out.println("���۴�������");
	}
	
}
class LX implements Brand{
	
	public void sale() {
		System.out.println("�����������");
	}
	
}
