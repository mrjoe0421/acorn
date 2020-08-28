package com.test;

import java.util.HashSet;
import java.util.Set;

public class SetService {
	Set<Person1> set= new HashSet<Person1>();
	int num =10;
	public int getNum() {
		return num;
	}
	
	public Set<Person1> getSet() {
		return set;
	}
		
	public void addPersonSet(Person1 p) {
		// 인자로 person을 받아와서 set에 add를 해주는 함수
		set.add(p);
		
	}
	public Set<Person1> getPersonSet(Set<SetService> set) {
		Set<Person1> set1= new HashSet<Person1>();
		Person1 kkkk = new Person1("유관순", 17, "서울");
		set1.add(new Person1("홍길동",20, "서울"));
		set1.add(new Person1("이순신",44, "전라"));
		set1.add(new Person1("이순신",44, "전라"));
		set1.add(kkkk);
		return set1;
		
	}
	public void printPerson() {
		for (Person1 person : set) {
			System.out.println(person);
			
		}
	}
}
