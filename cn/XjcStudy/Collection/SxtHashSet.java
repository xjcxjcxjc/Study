package cn.XjcStudy.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *  ÷–¥hashSet
 * @author œÓº—≥œ
 *
 */

public class SxtHashSet {

	
	HashMap map ;
	private final Object PRESENT =new Object();
	
	public SxtHashSet(){
		map = new HashMap();
	}
	
	public void add(Object obj) {
		map.put(obj, PRESENT);
		
	}
	
	public int size() {
		int k = map.size();
		return k;
	}
	
	
	@Override
		public String toString() {
		
			StringBuilder sb = new StringBuilder("[");
			
			for(Object temp : map.keySet()) {
				sb.append((String)temp+',');
			}
			sb.setCharAt(sb.length()-1, ']');
			return sb.toString();
		}
	
	
	public static void main(String[] args) {
		SxtHashSet set = new SxtHashSet();
		set.add("xjc");
		set.add("xjc1");
		set.add("xjc2");
		set.add("xjc3");
		set.add("xjc4");
		
		
		System.out.println(set);
		System.out.println(set.size());
	}
	
	
}
