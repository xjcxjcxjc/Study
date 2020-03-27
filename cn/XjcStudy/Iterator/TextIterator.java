package cn.XjcStudy.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cn.XjcStudy.Collection.TextList;


/**
 * ²âÊÔµü´úÆ÷±éÀú list map set
 * @author Ïî¼Ñ³Ï
 *
 */
public class TextIterator {

	public static void main(String[] args) {
		
		//TextlistIterator();	
		//TextSetIterator();
		TextmapIterator2();
	}
		
	
	public static void TextlistIterator(){ 
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(Iterator<Integer> itr = list.iterator();itr.hasNext();) {
			Integer temp = itr.next();
			System.out.println(temp);
			
		}
		
		
	}
	
	public static void TextSetIterator(){ 
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.add(4);
		set.add(5);
		
		for(Iterator<Integer> itr = set.iterator();itr.hasNext();) {
			Integer temp = itr.next();
			System.out.println(temp);
			
		}
		
		
	}
	
	public static void TextmapIterator() {
		Map<Integer, String> map = new  HashMap<Integer, String>();
		map.put(3, "xjc 3");
		map.put(4, "xjc 4");
		map.put(5, "xjc 5");
		
		Set<Entry<Integer,String>> ss = map.entrySet();
			
		for(Iterator<Entry<Integer,String>> itr =ss.iterator(); itr.hasNext(); ) {
			Entry<Integer,String> temp = itr.next();
			System.out.println(temp.getKey()+"---"+temp.getValue());
			
			
		}
		
	}


	public static void TextmapIterator2() {
		Map<Integer, String> map = new  HashMap<Integer, String>();
		map.put(3, "xjc 3");
		map.put(4, "xjc 4");
		map.put(5, "xjc 5");
		
		Set<Integer> ss2 = map.keySet();
			
		for(Iterator<Integer> itr =ss2.iterator(); itr.hasNext(); ) {
			Integer temp = itr.next();
			System.out.println(temp+"---"+map.get(temp));
			
			
		}
		
	}
	
}




