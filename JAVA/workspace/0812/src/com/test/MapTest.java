package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, Person1> map = new HashMap<>();
		map.put("one", new Person1("홍길동", 20, "서울"));
		map.put("two", new Person1("이순신", 30, "전라"));
		map.put("three", new Person1("유관순", 40, "서울"));

		
		//get(key)
		System.out.println(map.get("one").getName());
		Person1 one = map.get("one");
		System.out.println(one.getName());
		//keySet()
		Set<String> keys = map.keySet();
		for(String key : keys) {
			Person1 p = map.get(key);
			System.out.println(key + "=" + map.get(key));
		}
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key=ite.next();
			Person1 p = map.get(key);
			System.out.println(key+"\t"+p.getName());
		}
	}

}
