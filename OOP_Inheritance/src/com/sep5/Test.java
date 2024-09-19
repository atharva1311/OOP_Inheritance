package com.sep5;

public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		E e1 = new E();

		// a1 access only methods from class A
		a1.m1();
		// b1 can access all methods from class A and B
		b1.m1();
		b1.m2();
		// c1 can access all methods from class A and c
		c1.m1();
		c1.m3();
		// d1 can access all methods from class A and d
		d1.m1();
		d1.m4();
		// e1 can access all methods from class A,B and E
		e1.m5();
		e1.m2();
		e1.m1();

		// Dynamic dispatch

		A ab = new B();
		A ac = new C();
		A ad = new D();
		B be = new E();
		A ae = new E(); // *****

		ab.m1();
		ac.m1();
		ad.m1();
		be.m1();
		be.m2();
		ae.m1();

	}

}
