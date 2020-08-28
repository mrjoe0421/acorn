package com.test;

interface Vehicle{
	int num =10; //public static final 자동으로 지정된다.
	public abstract void speed();
	public default void start() {
		System.out.println("start~");
	}
	public static void stop() {
		System.out.println("stop");
	}
}
class Car implements Vehicle{

	@Override
	public void speed() {
		System.out.println("100km");
	}
	
}
public class Ex07_3 {

	public static void main(String[] args) {
		System.out.println(test.num);
		Car c = new Car();
		c.start();
		c.speed();
		Vehicle.stop();
	}

}
