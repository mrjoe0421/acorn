package com.test;

public class Ex08_3 {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Hello");
		
		s.append("world");
		System.out.println(s);
		s.insert(5, "!!!");
		System.out.println(s);
		s.delete(0, 5);
		System.out.println(s);

	}

}
