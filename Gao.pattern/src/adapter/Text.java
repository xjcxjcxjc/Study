package adapter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ≤‚ ‘  ≈‰∆˜ƒ£ Ω
 * @author œÓº—≥œ
 *
 */
public class Text {
	
	ByteArrayInputStream re ;
	static Text t; 
	private Text() {
		
	}
	
	
	public  synchronized static Text GetInstance( ) {
		t=new Text();
		return t;
	}
	
	public String read(byte[] by) {
		re =new   ByteArrayInputStream(by);
		
		byte[] ss=new byte[1024];
		String s=null;
		int i =-1;
		try {
			while ((i=re.read(ss))!=-1) {
				 s=new String(ss, 0, i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return s;
	}


	
}
