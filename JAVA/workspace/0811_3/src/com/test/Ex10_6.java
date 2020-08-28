package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10_6 {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>(); //Hash클래스 객체생성 ,<String>으로 제네릭 지정 HashSet은 String만 저장가능
		s.add("홍길동");
		s.add("이순신");
		s.add("유관순");
		s.add("홍길동");
		s.add("홍길동"); //홍길동은 중복없이 한번만 저장
		
		System.out.println("toSting() 전체 출력" + s);
		
		for (String data : s) { //foreach 반복문 사용 전체데이터 출력
			System.out.println("foreach 전체 출력: " + data );
		}
		
		System.out.println("Set의 데이터 갯수? " + s.size()); //데이터개수
		System.out.println("Set이 비어있냐? " + s.isEmpty()); //비었는지 true/false 확인
		System.out.println("Set에 이순신 포함 여부? " + s.contains("이순신")); 
		System.out.println("이순신 삭제 실행");
		s.remove("이순신"); //삭제
		
		for(String data : s) {
			System.out.println("foreach:" + data );
		}
		
		Iterator<String> ite = s.iterator(); //반복처리용 Iterator를 사용하여 데이터를 반복 출력
		while(ite.hasNext()) {
			String data = ite.next();
			System.out.println("Iterator:" + data);
		}
		System.out.println("전체 삭제 실행");
		s.clear();
		System.out.println("toString() 전체 출력" + s );
	}

}
