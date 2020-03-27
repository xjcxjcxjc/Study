package cn.XjcStudy.Collection;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;





/**
 * 测试HashSet
 * set 无序 不可重复  
 * @author 项佳诚
 *
 */
public class TextHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("xjc0");
		set.add("xjc1 ");
		Set<String> set2 = new HashSet<>();
		set2.add("xjc3");
		set.addAll(set2);
		System.out.println(set);
		
		
	}
	
}
