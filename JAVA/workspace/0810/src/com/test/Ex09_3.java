package com.test;

public class Ex09_3 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String name = null;
		System.out.println(name.length()
				);
		
		int [] num2 = {10, 20};
		System.out.println(num2[3]);
		
		try {
			int num = 3/ 0;
			System.out.println("문자열의 길이 : " + name.length());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage() + " NullPoninterException");
		} catch(ArithmeticException e2) {
			System.out.println(e2.getMessage() + " ArithmeticException");
		} catch(Exception e3) {
			System.out.println("모든 예외처리 가능");
		}
		

		
//	} catch(NullPointerException e) {
//		System.out.println("예외발생1" +e.getMessage() );
//	} catch(ArithmeticException e2) {
//		System.out.println("예외발생2" +e2.getMessage() );
//	} catch(Exception e3) {
//		System.out.println("예외발생3" + e.getMessage());
		
	}

}
