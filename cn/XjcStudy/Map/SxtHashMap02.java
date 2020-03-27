package cn.XjcStudy.Map;

/**
 * 自定义一个hashmap  
 * 实现tostring方法，方便查看map中的键对信息
 * 
 * @author 项佳诚
 *
 */

public class SxtHashMap02 {

	Node[] table;
	int size;
	
	public SxtHashMap02() {
		table =new Node[16];
	}
	
	
	@Override
		public String toString() {
				
		StringBuilder str = new StringBuilder("[");
		
		//遍历bucke数组
		for(int  i =0 ; i < table.length;i++) {
			Node temp = table[i];
			
		//遍历链表	
			while(temp!=null) {
				str.append(temp.key+":"+temp.value+",");
				temp=temp.next;
			}
		}
		str.setCharAt(str.length()-1, ']');	
		return str.toString();
		}
	
	
	
	public void put(Object key , Object value) {
	
		Node newnode = new Node();
		newnode.hash = myhash(key.hashCode(),table.length );
		newnode.key =key;
		newnode.value = value;
		newnode.next= null;
		
		Node temp = table[newnode.hash];
		Node last = null;
		boolean keyrepeat = false;
		
		if(temp==null) {
			//数组为空，直接将节点放进去
			table[newnode.hash]=newnode;
			System.out.println("#####");
			return;
		}else {
			//不为空，遍历对应链表
			while(temp!=null) {
				
				System.out.println("循环");
				//判断key是否重复
				if(temp.key.equals(key)) {    
					
					temp.value = value;
					keyrepeat = true;
					temp = null;
					
					break;
				}else {
					//不重复就遍历下一个
					last = temp;
					temp = temp.next;
				}
				
			}
			
		}
		
		if(!keyrepeat) {
			last.next = newnode;						
		}
		
	}
	
	
	public int myhash(int v , int length) {
		
		System.out.println("hash值:"+(v&(length-1)));// 直接位运算，效率高
		System.out.println("hash值："+(v%(length-1)));//取模运算效率低
		
		return v&(length-1);
		
		
	}
	
	
	public static void main(String[] args) {
		SxtHashMap02 m1 = new SxtHashMap02();
		m1.put(10, "aa");
		m1.put(20, "bb");
		m1.put(30, "cc");
		m1.put(20, "ssss");
		System.out.println("1");
		
		m1.put(53, "gg");
		m1.put(69, "hh");
		m1.put(85, "kk");
		System.out.println("2");
		
		System.out.println(m1);
		
	}
	
	
	
	
}
