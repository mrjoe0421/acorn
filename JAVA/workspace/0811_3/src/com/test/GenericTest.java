package com.test;

import java.util.Date;


//	Object obj; 임의의 데이터를 반환해야하기 때문에 리턴타입도 object이다.
//	
//	public void setValue(Object obj) {
//		this.obj = obj;
//	}
//	public Object getValue() {
//		return obj;
//	}
	


class Box<T>{
	T obj; //T 참조타입
	
	public void setValue(T obj) { //데이터설정, void가 있으므로 return값 받지 않는다.
		this.obj = obj;
	}
	public T getValue() { //데이터사용
		return obj;
	}
}
public class GenericTest {
	public static void main(String[] args) {
		
		//Box에 저장할 때마다 타입으로 String으로 한정
		Box<String>b = new Box<String>(); //객체생성
		b.setValue("Hello");
		String str = b.getValue();
		System.out.println(str);
		
		Box<Date> b2 =new Box<>(); //객체생성
		b2.setValue(new Date());
		Date d =b2.getValue();
		System.out.println(d);

	}

}
