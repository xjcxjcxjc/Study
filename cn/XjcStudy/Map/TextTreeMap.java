package cn.XjcStudy.Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * 测试TreeMap
 * 
 * TreeMap 与 HashMap 相比 线程安全效率不高
 * 
 * @author 项佳诚
 *
 */

public class TextTreeMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mp1 = new TreeMap<Integer, String>();
		
		mp1.put(23, "项佳诚1");
		mp1.put(2, "项佳诚2");
		mp1.put(12, "项佳诚3");
		
		System.out.println(mp1);
		
		
		Map<Emp,String> mp2 = new TreeMap<>();
		mp2.put(new Emp(1001,"项佳诚",23434), "不错不错");
		mp2.put(new Emp(1004,"项佳诚2",234332), "不错不错");
		mp2.put(new Emp(100,"项佳诚3",3453), "不错不错");
		mp2.put(new Emp(1003,"项佳诚4",23434), "不错不错");
		
		for(Emp key:mp2.keySet()) {
			System.out.println(key);
		}
		
	}
}


class Emp implements Comparable<Emp>{
	int id; 
	String name;
	double salary;
	
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
		public String toString() {
			
			return "id:"+id+" name:"+name+" salary:"+salary;
		}
	
	
	@Override
	public int compareTo(Emp o) {
		if(this.salary > o.salary) {
			return 1 ;
		}else if(this.salary<o.salary) {
			return -1;
		}else { 
			if(this.id>o.id) {
				return 1;
			}else if(this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		 }	
	}
	
	
	
	
}