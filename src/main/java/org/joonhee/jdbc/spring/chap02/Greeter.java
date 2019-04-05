package org.joonhee.jdbc.spring.chap02;

public class Greeter {
	
	public Greeter() {
		System.out.println("Greeter instance created!");
	}
	
	public String greet() {
		return "Hello, Spring!";
	}
}