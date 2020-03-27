package cn.XjcStudy.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ���Ա�����ݵĴ洢
 * @author ��ѳ�
 *ORM ˼��ļ�ʵ�� ��map ��ʾһ������ �����������Ƕ��map �������map�ŵ�list��
 */
public class TextStoreDate {

	public static void main(String[] args) {
		
		Map<String, Object> row1 = new  HashMap<>();
		row1.put("����", "����");
		row1.put("ID", 1001);
		row1.put("����", 20);
		row1.put("����", 2000);
	
		Map<String, Object> row2 = new  HashMap<>();
		row2.put("����", "����");
		row2.put("ID", 1002);
		row2.put("����", 30);
		row2.put("����", 10000);
		
		Map<String, Object> row3 = new  HashMap<>();
		row3.put("����", "����");
		row3.put("ID", 1003);
		row3.put("����", 30);
		row3.put("����", 40000);
		
		List<Map<String,Object>> list = new ArrayList<>();  //��mapװ��list��
		
		list.add(row1);
		list.add(row2);
		list.add(row3);
		
		for(Map<String,Object> row:list) {                       //����list�е�map�� �洢��Temp����
			
			Set<String> s1 = row.keySet();        //��map�����key�洢��s1 ����
			
			for(String key :s1) {                  //����Temp ����� key��
				
				System.out.print(key +":"+ row.get(key)+'\t');
			}
			
			System.out.println();
		}
	}
}
