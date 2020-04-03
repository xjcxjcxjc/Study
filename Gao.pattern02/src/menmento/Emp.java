package menmento;

public class Emp {
	private int age;
	private String name;
	private int solory;
	
	public Emp(int age, String name, int solory) {
		super();
		this.age = age;
		this.name = name;
		this.solory = solory;
	}
	
	public memento memento() {
		memento me =new memento();
		me.setAge(this.age);
		me.setName(name);
		me.setSolory(solory);
		return me;
		
	}
	
	public void recover(memento mo) {
		System.out.println("»Ö¸´");
		this.age = mo.getAge();
		this.name =mo.getName();
		this.solory =mo.getSolory();
		
	}
	
    	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSolory() {
		return solory;
	}
	public void setSolory(int solory) {
		this.solory = solory;
	}
	
	
	
	
}
