package cn.XjcStudy.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;





/**
 * 测试Collection接口中的方法
 * 
 *        项佳诚
 *
 */
public class TextList {

	public static void main(String[] args) {
		Text03();
	}


	static void Text01() {

	Collection<String> c = new ArrayList<>();
	
	System.out.println(c.size());
	System.out.println(c.isEmpty());
	
	
	c.add("项佳诚");
	c.add("项佳诚2");
	c.add("项佳诚3");
	
	System.out.println(c);
	System.out.println(c.contains("项佳诚2"));
	
	Object[] obj = c.toArray();
	System.out.println(obj);
	for(Object temp:obj) {
		System.out.println(temp);
	}
	
	c.removeAll(c);
	System.out.println(c.size());
	}


	static void Text02() {
		Collection<Integer> s = new ArrayList<>();
		s.add(1);
		s.add(2);
		s.add(3);
		
		Collection<Integer> s1 = new ArrayList<>();
		s1.add(3);
		s1.add(4);
		s1.add(5);
		
		s.addAll(s1);
		System.out.println(s);
		
		
		System.out.println(s.containsAll(s1));
		
		s.retainAll(s1);     //保留都有的元素
		System.out.println(s);
		
		s.removeAll(s1);       //移除都有的元素
		System.out.println(s1);
		System.out.println(s);
	}

	
	static void Text03() {
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		list.add(2, "项佳诚");
		System.out.println(list);
		
		list.set(2, "象");
		System.out.println(list);
	
		System.out.println(list.get(3));
		
		System.out.println(list.indexOf("象"));
		
		list.add("象");
		
		System.out.println(list.lastIndexOf("象"));
		
		
	}
}