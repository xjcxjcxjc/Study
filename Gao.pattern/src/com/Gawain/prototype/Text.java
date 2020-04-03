package com.Gawain.prototype;

import java.util.Date;

/**
 * 测试克隆和new对象的时间
 * @author Administrator
 *
 */
public class Text {

	public static  long textnew(int size) throws Exception {
		long d1 =System.currentTimeMillis();
		for (int i=0;i<size;i++) {
			Thread.currentThread().sleep(10);
			sheep s=new sheep();
		}
		long d2 =System.currentTimeMillis();
		return d2-d1;
	}
	
	
	public static long textclone(int size,sheep ss) throws Exception {
		long d1 =System.currentTimeMillis();
		for (int i=0;i<size;i++) {
			Thread.currentThread().sleep(10);
			sheep s=(sheep) ss.clone();
		}
		long d2 =System.currentTimeMillis();
		return d2-d1;
	}
	
	public static void main(String[] args) throws Exception {
		long tnew = textnew(100);
		long tclone = textnew(100);
		
		System.out.println(tnew);
		System.out.println(tclone);
		
	}
	
}

