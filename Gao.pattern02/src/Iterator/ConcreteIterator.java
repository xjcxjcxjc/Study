package Iterator;

/**
 * 类里面的类怎么掉
 */
import java.util.ArrayList;
import java.util.List;


public class ConcreteIterator{
	
	int iter=0;
	
	private List<Object> list1 =new ArrayList<Object>();
	
	public ConcreteIterator( ) {
		super();
	}
	
	public void add(Object obj) {
		this.list1.add(obj);
	}
	
	public void remove(Object obj) {
		this.list1.remove(obj);
	}
	
	
	public List<Object> getList1() {
		return list1;
	}

	public void setList1(List<Object> list1) {
		this.list1 = list1;
	}
	
	public Object GetCurrent() {
		
		return list1.get(iter);
	}
	
	
	public creIterator creatIter() {
		return new creIterator();
	}
	

	//类，迭代器
	public  class creIterator implements MyIterator{
		public creIterator() {
			
		}
		
		
		public boolean isfirst() {
			return iter==0?true:false;
		}

		public boolean hasnext() {
			return list1.size()>=iter+1?true:false;
		}

		public int currentIter() {
			return iter;
		}
		
		public void next() {
			if(hasnext()) {
				iter++;
			}
		}
		
	}
}
