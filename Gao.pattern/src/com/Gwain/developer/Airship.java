package com.Gwain.developer;

public class Airship{

	private String name;
	private orbitalmodule module;
	private shipEngine engine;
	private escapeTower tower;
	
	public void call() {
		
		System.out.println("major Tom to ground control");
	}
	
	public Airship(String name) {
	}

	public orbitalmodule getModule() {
		return module;
	}

	public void setModule(orbitalmodule module) {
		this.module = module;
	}

	public shipEngine getEngine() {
		return engine;
	}

	public void setEngine(shipEngine engine) {
		this.engine = engine;
	}

	public escapeTower getTower() {
		return tower;
	}

	public void setTower(escapeTower tower) {
		this.tower = tower;
	}
	
	
}

class orbitalmodule{
	private String name;
	public orbitalmodule() {
		this.name=name;
	}
	
}

class shipEngine{
	private String name;
	public shipEngine() {
		this.name=name;
	}
	
}

class escapeTower{
	private String name;
	public escapeTower() {
		this.name=name;
	}
	
}