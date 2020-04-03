package composite;

import java.util.ArrayList;

public interface File {

	String getname();
	void killvirus();
}

class Imafile implements File {

	private String name;
	
	public Imafile(String name) {
		super();
		this.name = name;
	}

	public void killvirus() {
		System.out.println("---ͼƬ�ļ�:"+name+"��ɱ����");
	}

	@Override
	public String getname() {
		return name;
	}
}

class Docfile implements File {

	private String name;
	
	public Docfile(String name) {
		super();
		this.name = name;
	}
	public String getname() {
		return name;
	}

	public void killvirus() {
		System.out.println("---�ĵ��ļ�:"+name+"��ɱ����");
	}
}

class Textfile implements File {

	private String name;
	
	public Textfile(String name) {
		super();
		this.name = name;
	}

	public String getname() {
		return name;
	}
	public void killvirus() {
		System.out.println("---�ı��ļ�:"+name+"��ɱ����");
	}
}


class Foldfile implements File {

	private String name;
	private int index;
	private ArrayList<File> Fold ;
	
	public String getname() {
		return name;
	}
	
	
	public Foldfile(String name) {
		super();
		Fold =new ArrayList<File>();
		this.name = name;
	}

	public void add(File f){
		Fold.add(f);
	}
	
	public void remove(File f) {
		Fold.remove(f); 
		
		for (File file : Fold) {
			String filen=file.getname();
			
			if(file instanceof Foldfile) {
				((Foldfile) file).remove(f);
			}

			
		}
	}
	
	
	
	public void killvirus() {
		System.out.println("----------�ļ����ļ�:"+name+"��ɱ����");
		for (File file : Fold) {
			file.killvirus();
		}
	}
}


