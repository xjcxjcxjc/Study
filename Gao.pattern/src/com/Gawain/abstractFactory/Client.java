package com.Gawain.abstractFactory;

public class Client {
	public static void main(String[] args) {
		luxuryfactory f= new  luxuryfactory();
		Engine e =f.creatEngine();
		e.run();
	}
}