package com.Gawain.prototype;

import java.util.Date;

/**
 * ���¡����¡����
 * @author ��ѳ�
 *
 */

public class sheep02 implements Cloneable {
	
	private Date birthday;
	private String name;
	
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		sheep02 s =(sheep02)obj;
		s.birthday =(Date) this.birthday.clone();
		return s;
		
	}
	public sheep02() {
		
	}
	
	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	
	
	
	
	
}
