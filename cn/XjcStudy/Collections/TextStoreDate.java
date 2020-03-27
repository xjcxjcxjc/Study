package cn.XjcStudy.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格数据的存储
 * @author 项佳诚
 *ORM 思想的简单实验 ：map 表示一行数据 ，多行数据是多个map ；将多个map放到list中
 */
public class TextStoreDate {

	public static void main(String[] args) {
		
		Map<String, Object> row1 = new  HashMap<>();
		row1.put("姓名", "张三");
		row1.put("ID", 1001);
		row1.put("年龄", 20);
		row1.put("工资", 2000);
	
		Map<String, Object> row2 = new  HashMap<>();
		row2.put("姓名", "李四");
		row2.put("ID", 1002);
		row2.put("年龄", 30);
		row2.put("工资", 10000);
		
		Map<String, Object> row3 = new  HashMap<>();
		row3.put("姓名", "王五");
		row3.put("ID", 1003);
		row3.put("年龄", 30);
		row3.put("工资", 40000);
		
		List<Map<String,Object>> list = new ArrayList<>();  //把map装进list中
		
		list.add(row1);
		list.add(row2);
		list.add(row3);
		
		for(Map<String,Object> row:list) {                       //遍历list中的map， 存储在Temp里面
			
			Set<String> s1 = row.keySet();        //把map里面的key存储在s1 里面
			
			for(String key :s1) {                  //遍历Temp 里面的 key；
				
				System.out.print(key +":"+ row.get(key)+'\t');
			}
			
			System.out.println();
		}
	}
}
