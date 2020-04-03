package composite;

/**
 * 组合模式
 * @author 项佳诚
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Imafile f1=new Imafile("项佳诚的大头照1");
		Docfile f2=new Docfile("项佳诚的文档1");
		Textfile f3=new Textfile("项佳诚的文本1");
		Foldfile f4=new Foldfile("项佳诚的文件夹1");
		    
		f4.add(f1);
		f4.add(f2);
		f4.add(f3);
		
		
		
		Imafile f5=new Imafile("项佳诚的大头照2");
		Docfile f6=new Docfile("项佳诚的文档2");
		Textfile f7=new Textfile("项佳诚的文本2");
		Foldfile f8=new Foldfile("项佳诚的文件夹2");
		    
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
