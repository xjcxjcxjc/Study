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
		System.out.println("---图片文件:"+name+"查杀病毒");
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
		System.out.println("---文档文件:"+name+"查杀病毒");
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
		System.out.println("---文本文件:"+name+"查杀病毒");
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
		System.out.println("----------文件夹文件:"+name+"查杀病毒");
		for (File file : Fold) {
			file.killvirus();
		}
	}
}


