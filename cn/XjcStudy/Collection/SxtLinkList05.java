package cn.XjcStudy.Collection;


/**
 * 自制链表 增加泛型 ,封装
 * @author 项佳诚
 * @param <E>
 *
 */
public class SxtLinkList05<E> {

	private Nobe first;
	private Nobe last;
	private int  size;
	
	
	public void add(int index,E element) {
		check(index);
		
		Nobe newnobe = new Nobe(element);
		Nobe temp = GetNumber(index);
		
		Nobe up = temp.previous;
		Nobe down = temp.next;
		
		if(temp!=null&&up!=null&&down!=null) {
			up.next=newnobe;
			newnobe.next = temp;
			temp.previous= newnobe;
			newnobe.previous = up;
		}else if(up==null) {
			first = newnobe;
			newnobe.next=temp;
			temp.previous=newnobe;
		}else {
			last= newnobe;
			newnobe.previous=temp;
			temp.next=newnobe;
		}
			
		
		
		
		size++;
	}
	
	
	public void add(E elemene) {
		Nobe nobe = new Nobe(elemene);
		
		if(first==null) {
			nobe.previous = null;
			nobe.next = null;
			first = nobe;
			last = nobe;
		}else {
			nobe.previous=last;
			nobe.next=null;
			
			last.next=nobe;
			last = nobe;
			
		}
		size++;
	}	
	
	
	
	//[a,b,c,d,e,f,g]
	public void remove(int index) {
		check(index);
		Nobe temp = GetNumber(index);
		Nobe up = temp.previous;
		Nobe down = temp.next;
		
		if(up!=null) {
			up.next=temp.next;
		}
		
		if(down!=null) {
			down.previous= temp.previous;
		}
		
		if(up==null) {
			first = down;
			first.next = down.next;
		}
		
		if(down==null) {
			last = up;
			last.previous=up.previous;
		}
		size--;
	}
	
	
	
	private void check(int index) {
		if(index < 0 | index >=size) {
			throw new RuntimeException("下标非法");
		}
	}
	
	
	private Nobe GetNumber(int index) {
		Nobe temp = null;
		if(index<=(size/2)) {
			
			temp = first;
			for(int i = 0 ; i <index ; i ++) {
				temp = temp.next;
			}
		}else {
			temp = last;
			for(int i = 0 ; i <size-index-1 ; i ++) {
				temp = temp.previous;
			}
		}
		return temp;
	}
	
	
	public E get(int index) {
		
		check(index);
		Nobe temp=GetNumber(index);
		
		return (E)temp.element;
	}
	
	
	
	@Override
		public String toString() {
			StringBuilder str = new StringBuilder("[");
			Nobe temp = first;
			
			while(temp!=null) {
				str.append(temp.element+",");
				temp=temp.next;
			}
			str.setCharAt(str.length()-1, ']');
			
			return str.toString();
		}
	
	
	public static void main(String[] args) {
		SxtLinkList05<String> xjc = new SxtLinkList05<>();
		xjc.add("a");
		xjc.add("b");
		xjc.add("c");
		xjc.add("d");
		xjc.add("e");
		xjc.add("f");
		xjc.add("g");		
		System.out.println(xjc.toString());
		System.out.println(xjc.get(4));
		xjc.remove(0);
		System.out.println(xjc);
		
		xjc.add(5, "x");
		System.out.println(xjc);
	}
	
}
