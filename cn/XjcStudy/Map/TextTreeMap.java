package cn.XjcStudy.Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * ����TreeMap
 * 
 * TreeMap �� HashMap ��� �̰߳�ȫЧ�ʲ���
 * 
 * @author ��ѳ�
 *
 */

public class TextTreeMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mp1 = new TreeMap<Integer, String>();
		
		mp1.put(23, "��ѳ�1");
		mp1.put(2, "��ѳ�2");
		mp1.put(12, "��ѳ�3");
		
		System.out.println(mp1);
		
		
		Map<Emp,String> mp2 = new TreeMap<>();
		mp2.put(new Emp(1001,"��ѳ�",23434), "������");
		mp2.put(new Emp(1004,"��ѳ�2",234332), "������");
		mp2.put(new Emp(100,"��ѳ�3",3453), "������");
		mp2.put(new Emp(1003,"��ѳ�4",23434), "������");
		
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