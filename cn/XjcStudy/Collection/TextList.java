package cn.XjcStudy.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;





/**
 * ����Collection�ӿ��еķ���
 * 
 *        ��ѳ�
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
	
	
	c.add("��ѳ�");
	c.add("��ѳ�2");
	c.add("��ѳ�3");
	
	System.out.println(c);
	System.out.println(c.contains("��ѳ�2"));
	
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
		
		s.retainAll(s1);     //�������е�Ԫ��
		System.out.println(s);
		
		s.removeAll(s1);       //�Ƴ����е�Ԫ��
		System.out.println(s1);
		System.out.println(s);
	}

	
	static void Text03() {
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		list.add(2, "��ѳ�");
		System.out.println(list);
		
		list.set(2, "��");
		System.out.println(list);
	
		System.out.println(list.get(3));
		
		System.out.println(list.indexOf("��"));
		
		list.add("��");
		
		System.out.println(list.lastIndexOf("��"));
		
		
	}
}