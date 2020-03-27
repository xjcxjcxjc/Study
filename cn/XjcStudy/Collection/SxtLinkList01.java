package cn.XjcStudy.Collection;


/**
 * 自制链表
 * @author 项佳诚
 *
 */
public class SxtLinkList01 {

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
		SxtLinkList01 xjc = new SxtLinkList01();
		xjc.add("a");
		xjc.add("b");
		xjc.add("c");
		System.out.println(xjc.toString());
	}
	
}
