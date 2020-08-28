package com.test;

import java.util.ArrayList;

public class RandomService {
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    
//    public RandomService() {
//    	super();
//    	list1 = new ArrayList<Integer>();
//    	list2 = new ArrayList<Integer>();
//    }		//위 new 다음을 지워주고 생성자를 생성해도 같다
    
    //1.makeRandomIn
	public void makeRandomInt() {
		 for(int i = 0 ; i < 10; i++) {
	            int randomValue1 = (int) (Math.random() * 10);	         
	            int randomValue2 = (int) (Math.random() * 10);	         
	            list1.add(randomValue1);	          
	            list2.add(randomValue1);	          
	        }
	}
	
	//2.printArrayList
	public void printArrayList() {
		 for(int i = 0; i < 10; i++) {
	            int list1Value = list1.get(i);
	            int list2Value = list2.get(i);
	            
	            try {
	                System.out.print(list1Value + "/" + list2Value + " ");
	                System.out.println(list1Value / list2Value);
	                
	            } catch (Exception e) {
	                System.out.println("분모가 0입니다");
	            } 
		 }
	}
}
