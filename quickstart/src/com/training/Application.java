package com.training;

public class Application {

	public static void main(String[] args) {
		Greeting grt=new Greeting();
		//System s=new System();constructor in this class is private so object cannot be created//
		System.out.println(grt.getMessage());
		System.out.println("Welcome");
		System.out.println(Greeting.getInfo());
		//System.out.println(grt.getInfo());//it should be called with class name// 
}
}
