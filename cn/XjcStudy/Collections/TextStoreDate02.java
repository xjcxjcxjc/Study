package cn.XjcStudy.Collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格数据的存储
 * 使用javabean 和 容器配合 
 * @author 项佳诚
 *
 */

public class TextStoreDate02 {

	public static void main(String[] args) {
	
		
		Emp3 e1 = new Emp3("张三", 1001, 20, 2000);		
		Emp3 e2 = new Emp3("李四", 1002, 30, 5000);
		Emp3 e3 = new Emp3("王五", 1003, 40, 20000);
		
		ArrayList<Emp3> list = new ArrayList<Emp3>();
 		list.add(e1);
 		list.add(e2);
 		list.add(e3);
		
 		for(Emp3 e : list) {
 			System.out.println(e);
 			
 		}
 		
 		Map<Integer, Emp3> map = new HashMap<Integer, Emp3>();
 		map.put(1001, e1);
 		map.put(1002, e2);
 		map.put(1003, e3);
 		
 		Emp3 e4 = map.get(1001);
 		System.out.println(e4);
 		System.out.println("#####");
 		
 		Set<Integer> set = map.keySet();
 		
 		for(Integer key :set) {
 			
 			System.out.println(map.get(key));
 		}
		
	}
	
}

class Emp3 {
	private String name;
	private int id ;
	private int age ;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Emp3(String name, int id, int age, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
		public String toString() {
			
			return "name:"+name+'\t'+"ID:"+id+'\t'+"age:"+age+'\t'+"salary:"+salary;
		}
	
	
}