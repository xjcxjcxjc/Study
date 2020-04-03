package Iterator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import Iterator.ConcreteIterator.creIterator;

/**
 * 手动迭代器
 * @author 项佳诚
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		ConcreteIterator con =new ConcreteIterator();
		MyIterator iter=con.creatIter();
		
		con.add("aa");
		con.add("bb");
		con.add("cc");
		con.add("xjc");
		con.add("hyy");
		
		while(iter.hasnext()) {
			Object s=con.GetCurrent();
			System.out.println(s);
			iter.next();
		}
	}

}


