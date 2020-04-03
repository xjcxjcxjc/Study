package menmento;

/**
 * 
 * @author Administrator
 *
 */

public class Client {
	
	public static void main(String[] args) {
		
		CareTaker taker=new CareTaker();
		Emp emp =new Emp(20,"项佳诚", 0);
		System.out.println("初始化name--->"+emp.getName());
		
		taker.setmemento(emp.memento());
		emp.setName("项明");
		System.out.println("修改后name--->"+emp.getName());
		
		emp.recover(taker.getmemento());
		System.out.println("恢复后name--->"+emp.getName());
		
	}
	
}
