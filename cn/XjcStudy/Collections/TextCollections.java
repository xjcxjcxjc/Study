package cn.XjcStudy.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * 
 * @author ПојСіП
 *
 */
public class TextCollections {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		for(int i = 0 ;i <10 ; i++) {
			list.add("По"+i);
			
		}
		
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "По6"));
	}
}
