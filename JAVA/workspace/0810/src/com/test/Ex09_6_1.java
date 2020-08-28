package com.test;

public class Ex09_6_1 {
	
	public static void a() throws NullPointerException{
		b();
	}
	
	public static void b() throws NullPointerException{
		int num =10;
		if(num==10) {
			throw new NullPointerException("널포인트익셉션발생");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			a();
		}catch(NullPointerException  e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("프로그램 정상 종료");
	}

}

	
