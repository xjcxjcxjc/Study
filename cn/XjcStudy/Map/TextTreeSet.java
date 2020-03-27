package cn.XjcStudy.Map;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * ≤‚ ‘TreeSet
 * @author œÓº—≥œ
 *
 */
public class TextTreeSet {

	
	
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(332);
		set.add(335);
		set.add(334);
		
		System.out.println(set);
		
		
		
		Set<Emp2> set1 = new TreeSet<Emp2>();
		Emp2 e1 = new Emp2(34,"xjc1",3456);
		Emp2 e2 = new Emp2(36,"xjc2",3456);
		Emp2 e3 = new Emp2(38,"xjc3",4343);
		Emp2 e4 = new Emp2(33,"xjc4",3452);
		
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		
		for(Emp2 temp :set1) {
			System.out.println(temp);
		}
	}
	
}


class Emp2 implements Comparable<Emp2>{
	int id ;
	String name ;
	double salary;
	
	public Emp2(int id, String name, double salary) {
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
	public int compareTo(Emp2 o) {
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