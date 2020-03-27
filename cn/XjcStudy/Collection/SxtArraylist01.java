package cn.XjcStudy.Collection;

import java.util.Arrays;

/**
 * 自定义实现Arraylist
 * @author 项佳诚
 *
 */
public class SxtArraylist01 {

	private Object[] elementDate;
	private int size;
	private final int DEFALT_CAPACITY = 10;
	
	
	public  SxtArraylist01() {
		elementDate = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArraylist01(int capacity) {
		elementDate = new Object[capacity];
	}
	
	public void add(Object obj) {
		if(size == elementDate.length) {
			Object[] array = new Object[elementDate.length+(elementDate.length>>1)];
			System.arraycopy(elementDate, 0, array, 0, size);
			elementDate = array;
		}
		
		
		elementDate[size++]= obj;
	}
	
	
	public String toString() {
		StringBuilder c = new StringBuilder();
		
		c.append("[");
		for(int i = 0 ; i <size ; i++){
			c.append(elementDate[i]+",");
			
		}
		
		c.setCharAt(c.length()-1,']');
		return c.toString();
	}
	
	
	public static void main(String[] args) {
		SxtArraylist01 s1 = new SxtArraylist01();
		
		for(int i = 0 ; i<40;i++ ) {
			s1.add("项"+i);
		
		}
		System.out.println(s1);
	}
	
	
}
