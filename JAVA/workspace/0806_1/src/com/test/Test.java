package com.test;

interface A{}
interface B{}

interface C extends A,B{}
class My implements A,B{}
public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		A a2 = new My();
	}

}
