package composite;

/**
 * ���ģʽ
 * @author ��ѳ�
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Imafile f1=new Imafile("��ѳϵĴ�ͷ��1");
		Docfile f2=new Docfile("��ѳϵ��ĵ�1");
		Textfile f3=new Textfile("��ѳϵ��ı�1");
		Foldfile f4=new Foldfile("��ѳϵ��ļ���1");
		    
		f4.add(f1);
		f4.add(f2);
		f4.add(f3);
		
		
		
		Imafile f5=new Imafile("��ѳϵĴ�ͷ��2");
		Docfile f6=new Docfile("��ѳϵ��ĵ�2");
		Textfile f7=new Textfile("��ѳϵ��ı�2");
		Foldfile f8=new Foldfile("��ѳϵ��ļ���2");
		    
		f8.add(f5);
		f8.add(f6);
		f8.add(f7);
		f4.add(f8);
		f4.add(f6);
		f8.add(f1);
		
		f4.remove(f1);
		f4.remove(f6);
		f4.killvirus();
	}

}
