package cn.XjcStudy.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 测试Map
 * @author 项佳诚
 *
 */
public class TextHashMap01 {
		
	public static void main(String[] args) {
		Map<Integer, String>  m1  = new HashMap<>();
		m1.put(1, "one");
		m1.put(2, "two");
		
		System.out.println(m1.get(1));
		System.out.println(m1);
		
		m1.remove(2);
		System.out.println(m1);
		
		System.out.println(m1.size());
		
		
		Map<Integer,String> m2 = new HashMap<>();
		m2.put(4,"四");
		m2.put(5,"五");
		
		m1.putAll(m2);
		System.out.println(m1);
		
		//map新的键会覆盖旧的键，用equals对比
		
		System.out.println(m2);
		
		System.out.println(m1.containsKey(4));     //是否包含键对象对应的键值
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsValue("五")); //  是否包含键值对应的键对象
	}
	
	
	
}


