package com.test;

interface Flyer {
	public abstract void takeoff();
	public abstract void fly();
	public void land();
}
public class Ex07_7 {

	public static void main(String[] args) {
		
		Flyer f = new Flyer() {
			public void fly() {
				System.out.println("fly");
			}

			@Override
			public void takeoff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void land() {
				// TODO Auto-generated method stub
				
			}			
		};
		f.fly();
	}

}
