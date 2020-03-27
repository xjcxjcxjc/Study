package cn.XjcStudy.Collection;


/**
 * 自制链表 增加get方法
 * @author 项佳诚
 *
 */
public class SxtLinkList02 {

	private Nobe first;
	private Nobe last;
	private int  size;
	
	public void add(Object obj) {
		Nobe nobe = new Nobe(obj);
		
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
	public Object get(int index) {
		if(index < 0 | index >=size) {
			throw new RuntimeException("下标非法");
		}
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
		
		return temp.element;
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
		SxtLinkList02 xjc = new SxtLinkList02();
		xjc.add("a");
		xjc.add("b");
		xjc.add("c");
		xjc.add("d");
		xjc.add("e");
		xjc.add("f");
		xjc.add("g");		
		System.out.println(xjc.toString());
		System.out.println(xjc.get(3));
	}
	
}
