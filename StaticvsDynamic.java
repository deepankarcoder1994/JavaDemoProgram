package com.ThreadDemo;


class Animal{
	void eat(){
		System.out.println("Animal is eating");
	}
}

public class StaticvsDynamic extends Animal {
	
	void eat(){
		System.out.println("Dog is eating");
	}

	public static void main(String[] args) {
		Animal a = new StaticvsDynamic();
		a.eat();
	}

}
