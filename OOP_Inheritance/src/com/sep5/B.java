package com.sep5;

public class B extends A {
	void m2()
	{
		System.out.println("This is method of B class");
	}
	@Override
	void m1() {
		System.out.println("Now this method is of class B");
	}

}
