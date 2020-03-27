package cn.XjcStudy.Collection;

import java.util.Arrays;



/**
 * 
 * 增加remove方法
 * @author 项佳诚
 *
 */
public class SxtArraylist02<E> {

	private Object[] elementDate;
	private int size;
	private final int DEFALT_CAPACITY = 10;
	
	
	public  SxtArraylist02() {
		elementDate = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArraylist02(int capacity) {
		if(capacity<0) {
			throw new RuntimeException("capacity非法");
		}
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
	
	public E set(Object obj ,int index) {
		CheckRange(index);
		elementDate[index] = obj;
		return null ;
	}
	
	
	public  E get(int index){
		CheckRange(index);
		E a= (E) elementDate[index];	
		return(E)a;
	}
	
	
	public void CheckRange(int index) {
		if(index < 0 | index >elementDate.length-1) {
			throw new RuntimeException("下标非法"+index);
		}		
	}
	
	
	public void remove(String str) {
		int k ;
		for(int i = 0 ; i <=size;i++) {
			if(str.equals(get(i))) {
				remove(i);
				break;
			}
		}
	}
	
	
	public void remove(int index) {
		
		int MoveNumber = elementDate.length-1-index;
		if(MoveNumber>0) {
			System.arraycopy(elementDate, index+1, elementDate, index,MoveNumber);		
		}
		
		elementDate[size-1]= null;
		size--;
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
		SxtArraylist02 s1 = new SxtArraylist02(20);
		
		for(int i = 0 ; i<40;i++ ) {
			s1.add("项"+i);
		
		}
		s1.set("hhhh", 29);
		System.out.println(s1);
		System.out.println(s1.get(29));
		
		s1.remove(29);
		System.out.println(s1);
		s1.remove("项4");
		System.out.println(s1);
	}
	
	
}
