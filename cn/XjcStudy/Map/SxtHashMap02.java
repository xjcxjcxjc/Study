package cn.XjcStudy.Map;

/**
 * �Զ���һ��hashmap  
 * ʵ��tostring����������鿴map�еļ�����Ϣ
 * 
 * @author ��ѳ�
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
		
		//����bucke����
		for(int  i =0 ; i < table.length;i++) {
			Node temp = table[i];
			
		//��������	
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
			//����Ϊ�գ�ֱ�ӽ��ڵ�Ž�ȥ
			table[newnode.hash]=newnode;
			System.out.println("#####");
			return;
		}else {
			//��Ϊ�գ�������Ӧ����
			while(temp!=null) {
				
				System.out.println("ѭ��");
				//�ж�key�Ƿ��ظ�
				if(temp.key.equals(key)) {    
					
					temp.value = value;
					keyrepeat = true;
					temp = null;
					
					break;
				}else {
					//���ظ��ͱ�����һ��
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
		
		System.out.println("hashֵ:"+(v&(length-1)));// ֱ��λ���㣬Ч�ʸ�
		System.out.println("hashֵ��"+(v%(length-1)));//ȡģ����Ч�ʵ�
		
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
