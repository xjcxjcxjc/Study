package menmento;

/**
 * 
 * @author Administrator
 *
 */

public class Client {
	
	public static void main(String[] args) {
		
		CareTaker taker=new CareTaker();
		Emp emp =new Emp(20,"��ѳ�", 0);
		System.out.println("��ʼ��name--->"+emp.getName());
		
		taker.setmemento(emp.memento());
		emp.setName("����");
		System.out.println("�޸ĺ�name--->"+emp.getName());
		
		emp.recover(taker.getmemento());
		System.out.println("�ָ���name--->"+emp.getName());
		
	}
	
}
