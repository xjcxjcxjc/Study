package cn.XjcStudy.Map;

/**
 * 自定义一个hashmap
 * @author 项佳诚
 *
 */

public class SxtHashMap01 {

	Node[] table;
	int size;
	
	public SxtHashMap01() {
		table =new Node[16];
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
		SxtHashMap01 m1 = new SxtHashMap01();
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
