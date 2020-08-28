package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_1 {

	public static void main(String[] args) { 
		//표준입력 ==> 키보드로 입력 한글입력가능 (byte->char로 변환)InputStreamReader사용
		//read()함수 사용
		InputStream is = null;
		
		try {
			byte [] b = new byte[5];
			System.out.println("데이터를 입력하시오");
			is = System.in;
			InputStreamReader reader =null;
			try {
				reader = new InputStreamReader(is);
				int n = reader.read();
				System.out.println((char)n);
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					reader.close();
					
				} catch (IOException e2) {
					e.printStackTrace();
				}
			}
	}

}
