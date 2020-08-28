package com.test;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	
	public Set<Person1> getPersonSet(Set<Person1> set) {
//		Set<Person1> set = new HashSet<Person1>();
		Person1 kkkk = new Person1("유관순", 17, "서울");
		set.add(new Person1("홍길동",20, "서울"));
		set.add(new Person1("이순신",44, "전라"));
		set.add(new Person1("이순신",44, "전라"));
		set.add(kkkk);
		set.add(kkkk);
		return set;
	}

	public static void main(String[] args) {
		
		Test test = new Test();//기본생성자 호출
		Set<Person1> set = new HashSet<Person1>();//비어 있는 set 생성
		Set<Person1> set2 =	test.getPersonSet(set); //빈 set을 함수에 넘김, 함수에서 객체를 담아서 리
		
		System.out.println(set);
		for(Person1 x :set) {
			System.out.println(x.getName());
		}
		Iterator<Person1> iterator=set2.iterator(); //collection에 저장된 데이터를  반복출력하기 위한 인터페이스 반환
		while(iterator.hasNext()) {
			Person1 p= iterator.next();
			System.out.println(p.getName());
		}

	}

}
