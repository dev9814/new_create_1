package test2;

import test1.Parent;

public class Child extends Parent{

	public void m1()
	{
		System.out.println("This is part of child class");
	}
	
	public static void main(String[] args) {
		
		Parent c1 = new Child();
		
		c1.m1();

	}

}
