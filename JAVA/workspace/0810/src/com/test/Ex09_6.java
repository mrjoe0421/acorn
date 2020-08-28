package com.test;

class SuperClass {
	public void a() throws NullPointerException{}
	public void b() throws Exception{}
	public void c() throws ArithmeticException{}
}
class Subclass extends SuperClass{

	@Override
	public void a() {}

	@Override
	public void b() throws RuntimeException {}

	@Override
	public void c() throws ArithmeticException {}
	
}
public class Ex09_6 {

	public static void main(String[] args) {
		
	}

}
