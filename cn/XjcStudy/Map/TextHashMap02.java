package cn.XjcStudy.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的常用方法
 * @author 项佳诚
 *
 */
public class TextHashMap02 {

	public static void main(String[] args) {
		employee e1 = new employee(1001, "项佳诚", 5000);
		employee e2 = new employee(1002, "项佳诚2", 6000);		
		employee e3 = new employee(1003, "项佳诚3", 7000);
		
		Map<Integer, employee> map = new HashMap<>();
		map.put(1001, e1);
		map.put(1002, e2);
		map.put(1003, e3);
		
		System.out.println(e1);
		System.out.println(map.get(1003));
		
		
	}
	
	
}

class employee{
	private int id ;
	private String name;
	private double salary;
	
	public employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
		public String toString() {
			
			return "id:"+id+" name:"+name+" salary:"+salary;
		}
	
}