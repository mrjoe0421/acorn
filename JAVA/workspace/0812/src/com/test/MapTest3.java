package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class MapTest3 {

	public static void main(String[] args) {
		
		HashMap<String, Person1> map1 = new HashMap<>();
		map1.put("one", new Person1("홍길동", 20, "서울"));
		map1.put("two", new Person1("이순신", 30, "전라"));
		map1.put("three", new Person1("유관순", 40, "서울"));
		
		HashMap<String, Person1> map2 = new HashMap<>();
		map2.put("one", new Person1("홍길동2", 20, "서울"));
		map2.put("two", new Person1("이순신2", 30, "전라"));
		map2.put("three", new Person1("유관순2", 40, "서울"));
		
		ArrayList<HashMap<String, Person1>> list = new ArrayList<>();
		list.add(map1);
		list.add(map2);
		
		for(HashMap<String, Person1> x : list) {
			Set<String> keys = x.keySet();
			for(String key : keys) {
				Person1 p = x.get(key);
				System.out.println(p.getName());
			}
		}
		
			
		}
		
	}


