package cn.XjcStudy.Map;

/**
 * 自定义一个hashmap  
 * 实现get方法，
 * 
 * @author 项佳诚
 *
 */

public class SxtHashMap03<K,V> {

	Node[] table;
	int size;
	
	public SxtHashMap03() {
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
	
	
	public V get(K key) {
		
		Node node = new Node();
		node.hash = myhash(key.hashCode(),table.length );
		node.key = key ;
		V value = null;
		
		boolean flag = true;             //判断有无找到；
		
		Node temp = table[node.hash];
		
		if(temp == null) {
			return null;
		}
		
		
		
		if(temp.key.equals(node.key)) {           //第一个就是要找的值；
			value= (V)temp.value;
			flag = false;
		}else {
			while(temp.next!=null) {            // 遍历链表
				temp = temp.next;
				if(temp.key.equals(key)) {
					value=(V)temp.value;
					flag = false;	
					break;
				}
			}
			
		}
		
		return value;
		
	}
	
	
	public void put(K key , V value) {
	
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
		SxtHashMap03<Integer,String> m1 = new SxtHashMap03<>();
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
		
		System.out.println(m1.get(69));
	}
	
	
	
	
}
