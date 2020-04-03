package com.Gawain.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 浅克隆，公用一个对象
 * @author 项佳诚
 *
 */

public class sheep implements Cloneable,Serializable {
	
	private Date birthday;
	private String name;
	
	public sheep() {
		
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



	protected Object clone() throws CloneNotSupportedException {
		sheep obj =(sheep) super.clone();
		return obj;
		
	}
	
	
	
	
	
}
