package cn.XjcStudy.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * ����Map
 * @author ��ѳ�
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
		m2.put(4,"��");
		m2.put(5,"��");
		
		m1.putAll(m2);
		System.out.println(m1);
		
		//map�µļ��Ḳ�Ǿɵļ�����equals�Ա�
		
		System.out.println(m2);
		
		System.out.println(m1.containsKey(4));     //�Ƿ�����������Ӧ�ļ�ֵ
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsValue("��")); //  �Ƿ������ֵ��Ӧ�ļ�����
	}
	
	
	
}


