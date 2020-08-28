package com.test;

import java.util.Arrays;

public class Ex08_17 {

	public static void main(String[] args) {
		
		String [] str = {"홍길동", "이순신", " 유관순"};
		String [] str2 = Arrays.copyOf(str, str.length);
		for(String name : str2) {
			System.out.println("이름 : "+ name);
		}
		int [] nums = {10, 20,30};
		Arrays.fill(nums, 100);
		
		for(int num : nums) {
			System.out.println("fill 값: " + num);
		}
		String [] fruits = {"사과", "배", "수박", "바나나"};
		Arrays.fill(fruits, 0, 2, "딸기");
		for(String fruit : fruits) {
			System.out.println("fruit: " + fruit);
		}
		String [] p = {"홍길동", "이순신", "유관순"};
		String [] p2 = {"홍길동", "이순신", "유관순"};
		System.out.println(Arrays.equals(p, p2));
		
		int [] num = {22, 1, 3, 5, 2, 4, 11};
		Arrays.sort(num);
		for(int i : num) {
			System.out.println("정렬된 정수값 : " + i);
		}
		
		String [] name = {"xMan", "Alex", "XMan", "Bob", "Curl", "Flex", "alex"};
		
		Arrays.sort(name);
		for(String n : name) {
			System.out.println("정렬된 이름 : " + n);
		}
		
		String [] s = {"홍길동", "이순신", "유관순"};
		int index = Arrays.binarySearch(s, "이순신");
		System.out.println(index);
		
	}

}
